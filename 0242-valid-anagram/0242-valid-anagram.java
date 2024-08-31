class Solution {
    public boolean isAnagram(String s, String t) {

        //if the lengths are not equal it cant be anagram
        if(s.length() != t.length())
            return false;
        
        // Create a HashMap to count characters
        HashMap<Character, Integer> map = new HashMap<>();

        //counet each char in the string s
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        
        // Subtract the count for each character in string `t`
        for(char c : t.toCharArray()){
            if(!map.containsKey(c))
                return false; //if 't' has char that not is 's'
            
            //we substurct 1 from the value of key c
            map.put(c, map.get(c)-1);
            
            // If `t` has more of a character c than `s`
            if(map.get(c)<0)
                return false;
        }

        return true; //we have an anagram!
    }
}