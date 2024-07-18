package easy.string;

import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "ba"));
    }

    //best solution
    public static boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String str1 = new String(charArray);
        charArray = t.toCharArray();
        Arrays.sort(charArray);
        String str2 = new String(charArray);
        return str1.equals(str2);
    }
}
// first solution

//if(s.length() != t.length())
//        return false;
//        else{
//        for(int j = 0; j < t.length(); j++) {
//        for (int i = 0; i < s.length(); i++) {
//        if(t.charAt(j) == s.charAt(i)){
//s = s.substring(0, i) + s.substring(i + 1);
//i = 0;
//        break;
//        }
//        }
//        }
//        if(s.isEmpty())
//        return true;
//        else return false;
//        }

//second solution
//if(s.length() != t.length())
//        return false;
//HashMap<Character, Integer> countCharacters = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//        if(countCharacters.containsKey(s.charAt(i))){
//        countCharacters.put(s.charAt(i), countCharacters.getOrDefault(s.charAt(i), 0) + 1);
//        }else countCharacters.put(s.charAt(i), 1);
//        }
//        for(int i = 0; i < t.length(); i++){
//        if(countCharacters.containsKey(t.charAt(i)))
//        countCharacters.put(t.charAt(i), countCharacters.getOrDefault(t.charAt(i), 0) - 1);
//        }
//        for(Character ch : countCharacters.keySet())
//        if(countCharacters.get(ch) != 0)
//        return false;
//        return true;

//third solution

//if(s.length() != t.length())
//        return false;
//int[] letters = new int[26];
//        for(int i = 0; i < s.length(); i++){
//letters[(int)s.charAt(i) - 97]++;
//letters[(int)t.charAt(i) - 97]--;
//        }
//        for(int i = 0; i < letters.length; i++){
//        if(letters[i] != 0)
//        return false;
//        }
//        return true;