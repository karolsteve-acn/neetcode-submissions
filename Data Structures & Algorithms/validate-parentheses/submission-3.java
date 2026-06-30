class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ']' || c == ')' || c == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char o = c == ']' ? '[' : c == ')' ? '(' : '{';
                if(stack.pop() != o) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
