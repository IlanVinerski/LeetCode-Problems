class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();
        int i=0;

        while(i < nums.length){

            int start = nums[i];

            while(i < nums.length - 1 && nums[i+1] - 1 == nums[i])
                i++;
            
            //if we have inerval
            if (start != nums[i])
                ans.add(String.valueOf(start) + "->" + String.valueOf(nums[i]));

            //if we dont have interval
            else
                ans.add(String.valueOf(nums[i]));

            // Update the start for the next range
            i++;
        }
        return ans;
    }
}

//time O(n)
//place O(n)