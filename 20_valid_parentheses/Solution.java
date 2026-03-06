import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        Stack<Character> chars = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isCloseBracket(c)) {
                if (chars.isEmpty() || chars.pop() != getOpenBracket(c)) {
                    return false;
                }
            } else {
                chars.push(c);
            }
        }
        return chars.isEmpty();
    }

    public boolean isCloseBracket(char c) {
        return switch (c) {
            case ')', ']', '}' -> true;
            default -> false;
        };
    }
    public char getOpenBracket(char c) {
        return switch (c) {
            case ')' -> '('; 
            case ']' -> '['; 
            case '}' -> '{';
            default -> ' ';
        };
    }

    public void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}