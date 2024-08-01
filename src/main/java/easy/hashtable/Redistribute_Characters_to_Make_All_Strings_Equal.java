package easy.hashtable;

public class Redistribute_Characters_to_Make_All_Strings_Equal {
    public static void main(String[] args) {

    }

    public boolean makeEqual(String[] words) {
            final int[] characterCount = new int[26];
            for (String inputWord : words) {
                for (char inputChar : inputWord.toCharArray()) {
                    characterCount[inputChar - 'a']++;
                }
            }
            for (int count : characterCount) {
                if (count % words.length != 0) {
                    return false;
                }
            }
            return true;
    }
}
