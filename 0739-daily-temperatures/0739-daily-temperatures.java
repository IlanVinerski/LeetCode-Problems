class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return results;
    }
}

/*
Time complexity: O(n), where n is the number of temperatures.
Space complexity: O(n), as the stack can have at most n elements.
 */