package easy.sorting;

import java.util.Arrays;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static void main(String[] args) {

    }

    public int specialArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[0] >= n)
            return n;
        for(int i = 1; i <= n; i++)
            if(nums[n - i] >= i && (n - i - 1 < 0 || nums[n - i - 1] < i))
                return i;
        return -1;
    }
}
