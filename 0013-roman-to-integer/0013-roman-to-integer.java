     class Solution{
     public int romanToInt(String s) {
        // Step 1: Create a HashMap to store Roman numerals and their integer values
        HashMap<Character, Integer> d = new HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);

        // Step 2: Initialize the result variable
        int result = 0;

        // Step 3: Iterate over the characters of the input string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral
            int currentValue = d.get(s.charAt(i));

            // Check if the current numeral should be subtracted
            // (if it's less than the next numeral)
            if (i < s.length() - 1 && currentValue < d.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}