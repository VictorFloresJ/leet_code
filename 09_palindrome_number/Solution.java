class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int remaining = x;
        int reversedNumber = 0;
        while (remaining > 0) {
            int lastDigit = remaining % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            remaining = remaining / 10;
        }
        return reversedNumber == x;
    }
    
    public boolean isPalindromeUsingStrings(int x) {
        var convertedNumber = String.valueOf(x);
        char left;
        char right;
        if (x < 0) return false;
        for(int i = 0; i < convertedNumber.length() / 2; i++) {
            left = convertedNumber.charAt(i);
            right = convertedNumber.charAt(convertedNumber.length() - i - 1);
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    public void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindromeUsingStrings(121));
    }
}
