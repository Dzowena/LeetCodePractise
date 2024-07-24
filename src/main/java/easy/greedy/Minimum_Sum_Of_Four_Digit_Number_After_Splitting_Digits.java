package easy.greedy;

import java.util.Arrays;

public class Minimum_Sum_Of_Four_Digit_Number_After_Splitting_Digits {
    public static void main(String[] args) {

    }

    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        return (arr[0] * 10) + (arr[1] * 10) + arr[2] + arr[3];
    }

}
