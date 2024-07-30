package easy.hashtable;

import java.util.Arrays;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[200];
        int[] arr2 = new int[200];
        for(int i = 0; i < s.length(); i++){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)])
                return false;
            arr1[s.charAt(i)] = i + 1;
            arr2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
