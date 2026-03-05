class Solution {

    public int romanToInt(String s) {
        int i = 0;
        int total = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            if (i < s.length() - 1 && getValue(currentChar) < getValue(s.charAt(i + 1))) {
                total -= getValue(currentChar);
            } else {
                total += getValue(currentChar);
            }
            i++;
        }
        return total;
    }

    public int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }

    public void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}