package easy.hashtable;

import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {

    }

    public boolean uniqueOccurrences(int[] arr) {
        int[] ar = new int[2002];
        HashSet<Integer> unique = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                ar[arr[i] + 1001]++;
            else ar[arr[i] + 1000]++;
        }
        for(int i = 0; i < ar.length; i++){
            if(unique.contains(ar[i]))
                return false;
            if(ar[i] != 0)
                unique.add(ar[i]);
        }
        return true;
    }
}
