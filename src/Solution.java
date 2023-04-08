class Solution {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sbWord1 = new StringBuilder();
        StringBuilder sbWord2 = new StringBuilder();

        for(int i = 0 ; i < word1.length; i++)
            sbWord1.append(word1[i]);
        for(int i = 0 ; i < word2.length; i++)
            sbWord2.append(word2[i]);

        if(sbWord1.length() != sbWord2.length()){
            return false;
        } else {
            for(int i = 0; i < sbWord2.length(); i++){
                if(sbWord1.charAt(i) != sbWord2.charAt(i))
                    return false;
            }
        }
        return true;

    }
}
