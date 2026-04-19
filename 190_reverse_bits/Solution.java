class Solution {
    public int reverseBits(int n) {
        int reversedNum = 0;
        
        for (int i = 0; i < 31; i++) {
            reversedNum |= n & 1;
            reversedNum = reversedNum << 1;
            n = n >>> 1;
        }

        return reversedNum;
    }

    public void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}