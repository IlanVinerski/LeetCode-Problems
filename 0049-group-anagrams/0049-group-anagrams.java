class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray())
                 ca[c - 'a']++;

            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) 
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }   
 }

// Constructing the frequency array takes O(N) for each string, where N is the length of the string.

// The overall time complexity is O(K * N), where K is the total number of strings.
