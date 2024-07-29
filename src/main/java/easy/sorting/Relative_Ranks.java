package easy.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks {
    public static void main(String[] args) {
        String[] temp = findRelativeRanks(new int[]{5,4,3,2,1});
        for(int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + "  ");
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] sortedPairs = new int[n][2];
        for (int i = 0 ; i < n ; i++) sortedPairs[i] = new int[] {i, score[i]};
        Arrays.sort(sortedPairs, (x, y) -> (y[1] - x[1]));
        String[] ans = new String[n];
        for (int i = 0 ; i < n ; i++) {
            if (i == 0) {
                ans[sortedPairs[i][0]] = "Gold Medal";
            } else if (i == 1) {
                ans[sortedPairs[i][0]] = "Silver Medal";
            } else if (i == 2) {
                ans[sortedPairs[i][0]] = "Bronze Medal";
            } else {
                ans[sortedPairs[i][0]] = String.valueOf(i+1);
            }
        }
        return ans;
    }
}


//bad solution
//int[] arr = new int[score.length];
//        for(int i = 0; i < score.length; i++)
//arr[i] = score[i];
//String[] answer = new String[score.length];
//        Arrays.sort(arr);
//        for(int i = 0; i < score.length; i++){
//        for(int j = 0; j < arr.length; j++){
//        if(score[i] == arr[j]){
//String temp;
//                    if(j == arr.length - 1)
//temp = "Gold Medal";
//        else if (j == arr.length - 2)
//temp = "Silver Medal";
//        else if(j == arr.length - 3)
//temp = "Bronze Medal";
//        else temp = "" + (arr.length - j);
//answer[i] = temp;
//                }
//                        }
//                        }
//                        return answer;