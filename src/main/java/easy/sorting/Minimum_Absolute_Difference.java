package easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Difference {
    public static void main(String[] args) {

    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        int length = arr.length, min = arr[1] - arr[0];
        for(int i = 0; i < length - 1; i++){
            if(arr[i + 1] - arr[i] < min)
                min = arr[i + 1] - arr[i];
        }
        for(int i = 0; i < length - 1; i++){
            if(arr[i + 1] - arr[i] == min) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                answer.add(temp);
            }
        }
        return answer;
    }
}
