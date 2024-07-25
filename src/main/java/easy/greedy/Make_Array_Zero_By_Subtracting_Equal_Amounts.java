package easy.greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Make_Array_Zero_By_Subtracting_Equal_Amounts {
    public static void main(String[] args) {

    }

    public static int minimumOperations(int[] nums) {
        int answer = 0;
        Set<Integer> uniques = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!uniques.contains(nums[i])){
                if(nums[i] != 0){
                    uniques.add(nums[i]);
                    answer++;
                }
            }
        }
        return answer;
    }

}
