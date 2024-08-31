class Solution {
    public int longestConsecutive(int[] nums) {

        //Use a HashSet: Add all elements to a HashSet to allow O(1) lookups
        Set<Integer> numSet = new HashSet<>();

        //entering the numbers to the hashSet
        for(int x : nums)
            numSet.add(x);

        //the answer we will return in the end
        int longestStreak = 0;

        //loop for find the Longest Consecutive Sequence
        for(int x : nums){
        // Only start counting if 'num' is the beginning of a sequence
          if(!numSet.contains(x-1)){
            int currentNum = x;
            int currentStreak = 1;

             // Count the length of the consecutive sequence
             while(numSet.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
             }
             longestStreak = Math.max(longestStreak,currentStreak);
          }

        }
        return longestStreak;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(n)
 */