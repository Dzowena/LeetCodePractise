package easy.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Set_Mismatch {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans[0] = index + 1;
            } else {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}

//first solution
//HashMap<Integer, Integer> count = new HashMap<>();
//        int length = nums.length, sum = (length * (length + 1)) / 2, wrongSum = 0;
//int[] answer = new int[2];
//        for(int i = 0; i < length; i++)
//        count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
//        for(int number : count.keySet()){
//wrongSum += number;
//            if(count.get(number) == 2)
//answer[0] = number;
//        }
//answer[1] = sum - wrongSum;
//        return answer;

//second solution
//int length = nums.length, sum = (length * (length + 1)) / 2;
//int[] answer = new int[2];
//Set<Integer> unique = new HashSet<>();
//        for(int i = 0; i < length; i++){
//        if(unique.contains(nums[i]))
//answer[0] = nums[i];
//        else{
//        unique.add(nums[i]);
//sum -= nums[i];
//        }
//        }
//answer[1] = sum;
//        return answer;

//third solution
//int[] answer = new int[2];
//        Arrays.sort(nums);
//        int length = nums.length, sum = ((length * (length + 1)) / 2) - nums[0], wrongSum = 0;
//        for(int i = 1; i < length; i++){
//        if(nums[i] == nums[i - 1])
//answer[0] = nums[i];
//        else sum -= nums[i];
//        }
//answer[1] = sum;
//        return answer;