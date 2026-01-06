class Solution {
    public int calculate(String s) {

        int result = 0;     // final result
        int number = 0;     // current number
        int sign = 1;       // +1 or -1

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If digit, build the number
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            // If + or -
            else if (ch == '+' || ch == '-') {
                result += sign * number;
                number = 0;
                sign = (ch == '+') ? 1 : -1;
            }

            // If opening bracket
            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }

            // If closing bracket
            else if (ch == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();   // sign
                result += stack.pop();   // previous result
            }
        }

        // add last number
        result += sign * number;

        return result;
    }
}

