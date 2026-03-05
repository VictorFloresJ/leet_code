class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        int maxLengthPossible = strs[0].length();
        String shortestWord = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if (strs[i].length() < maxLengthPossible) {
                maxLengthPossible = strs[i].length();
                shortestWord = strs[i];
            }
        }

        StringBuilder prefix = new StringBuilder();
        for(int i = 0; i < maxLengthPossible; i++) {
            char charToCompare = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != charToCompare){
                    return prefix.toString();
                }
            }
            prefix.append(shortestWord.charAt(i));
        }
        return prefix.toString();
    }

    public void main(String[] args) {
        String[] strs = new String[]{"asdasdojasodjaojsdo","dog","dog"};
        System.out.println(longestCommonPrefix(strs));
    }
}