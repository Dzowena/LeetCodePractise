package easy.hashtable;

import java.util.ArrayList;
import java.util.List;

public class Find_Common_Characters {
    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] words) {
        int[] last = count(words[0]);
        List<String> answer = new ArrayList<>();
        for(int i = 1; i < words.length; i++){
            last = intersection(last, count(words[i]));
        }
        for(int i = 0; i < 26; i++){
            if(last[i] != 0)
                for(int j = 0; j < last[i]; j++)
                    answer.add("" + (char)(i + 'a'));
        }
        return answer;
    }

    public int[] intersection(int[] a, int[] b){
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++){
            arr[i] = Math.min(a[i], b[i]);
        }
        return arr;
    }

    public int[] count(String str){
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'a']++;
        }
        return arr;
    }
}


//first solution
//int n = words.length;
//    int[][] arr = new int[n][26];
//    List<String> answer = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//        for(int j = 0; j < words[i].length(); j++)
//            arr[i][words[i].charAt(j) - 'a']++;
//    }
//    int[] temp = chars(arr);
//        for(int i = 0; i < temp.length; i++){
//        if(temp[i] != 0){
//            for(int j = 0; j < temp[i]; j++){
//                answer.add("" + (char)(i + 'a'));
//            }
//        }
//    }
//        return answer;
//}
//
//public static int[] chars(int[][] arr){
//    int[] ans = new int[26];
//    for(int i = 0; i < 26; i++) {
//        int min = Integer.MAX_VALUE;
//        for (int j = 0; j < arr.length; j++) {
//            min = Math.min(arr[j][i], min);
//        }
//        ans[i] = min;
//    }
//    return ans;
//}