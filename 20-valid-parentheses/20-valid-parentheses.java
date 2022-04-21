class Solution {

    public boolean isValid(String c) {
        if (c.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char s : c.toCharArray()) {
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
            } else if (s == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (s == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (s == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else 
                return false;
        }
        return stack.isEmpty();
    }
}
