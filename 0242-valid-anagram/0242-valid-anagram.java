class Solution {
    public boolean isAnagram(String s, String t) {

         int[] numbers = new int[26];

        if(s.length()!=t.length()){
            return false;
        }

        for(char ch: s.toCharArray()){
            numbers[ch-97]++;
        }
        for(char ch: t.toCharArray()){
            if(numbers[ch-97]>0){
                numbers[ch-97]--;
            } else{
                return false;
            }
        }
        return true;
    }
}

