public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Initialize the output array where each element is 1
        output[0] = 1;
        
        // Left Pass: Compute the product of all elements to the left of nums[i]
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Right Pass: Compute the product of all elements to the right of nums[i]
        // and multiply with the left product stored in output array
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right *= nums[i];
        }
        
        return output;
    }
}
