package easy.sorting;


import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return (sum - actualSum);
    }
}
