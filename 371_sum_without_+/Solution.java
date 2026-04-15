class Solution{
    public int getSum(int a, int b) {
        int sum = a;
        int carry = b;
        
        while (carry != 0) {
            int temp  = (sum & carry) << 1;
            sum = (sum ^ carry);
            carry = temp;
        }
        return sum;
    }

    public void main(String[] args) {
        int a = 3;
        int b = 9;

        System.out.println(getSum(a, b));
    }
}