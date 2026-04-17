class Solution {
    public int hammingWeight(int n) {
        int numsOfOnes = 0;
        while(n!= 0) {
            if (n % 2 == 1) numsOfOnes++;
            n /= 2;
        }
        return numsOfOnes;

        /*
        int cociente = n;
        ArrayList<Integer> residuos = new ArrayList<>();
        while(cociente!= 0) {
            int residuo = cociente % 2;
            residuos.add(residuo);
            cociente = cociente / 2;
        }
        int numsOfOnes = 0;
        for (Integer residuo : residuos) {
            if (residuo == 1) numsOfOnes++;
        }
        return numsOfOnes;
         */
    }

    public int hammingWeightOpt(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }

/*
    public int hammingWeight(int n) {

        int count = 0;

        while(n != 0){
            count++;

            n &= (n - 1);
        }

        return count;
        
    }
*/

    public void main(String[] args) {
        System.out.println(hammingWeight(2147483645));
        System.out.println(hammingWeightOpt(2147483645));
    }
}