class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        //pass thorw a string with charAt(index)

        while(left < right){

            // Move left index forward if the character is not alphanumeric
             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move right index backward if the character is not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters after filtering
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            // Move towards the center
            left++;
            right--;
        }
        return true;
    }
}

//Time: O(n): The string is traversed at most twice (once by each pointer), making the solution linear in time.