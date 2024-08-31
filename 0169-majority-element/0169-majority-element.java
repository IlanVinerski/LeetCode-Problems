class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int temp = nums.length/2;

        for(int num : nums){
           map.put(num, map.getOrDefault(num,0)+1);
           if(map.get(num) > temp)
                return num;
        }
        return -1;
    }
}

/*
Time Complexity: O(n) - We traverse the array once, and HashMap operations (get/put) are O(1).
Space Complexity: O(n) - In the worst case, all elements are different, and we store each one in the HashMap.
 */