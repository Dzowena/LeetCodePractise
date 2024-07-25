package easy.sorting;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int idx = n-1;
        int i=0,j=n-1;

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[idx--] = nums[i]*nums[i];
                i++;
            }else{
                ans[idx--] = nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}
