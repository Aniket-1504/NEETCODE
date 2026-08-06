class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                top++;
                stack[top] = c;
            } else {
                if (top == -1) {
                    return false;
                }

                char open = stack[top];
                if ((open == '(' && c == ')') ||
                    (open == '[' && c == ']') ||
                    (open == '{' && c == '}')) {
                    top--;
                } else {
                    return false;
                }
            }
        }

        return top == -1;
    }
}