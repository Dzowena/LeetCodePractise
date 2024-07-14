package easy.string;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder answer= new StringBuilder();
        int index = word2.length();
        int length = word2.length();
        if(word1.length() < word2.length()) {
            length = word1.length();
            index = word1.length();
        }
        int indexA = 0;
        int indexB = 0;
        for(int i = 0; i < 2 * length; i++){
            if(i % 2 == 0) {
                answer.append(word1.charAt(indexA));
                indexA++;
            }else {
                answer.append(word2.charAt(indexB));
                indexB++;
            }
        }
        if (index == word2.length()) {
            answer.append(word1.substring(index));
        } else {
            answer.append(word2.substring(index));
        }
        return answer.toString();
    }
}
