package easy.arrays;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] test = new int[]{0,0,1,1,1,2,2,3,3,4};
        int answer = removeDuplicates(test);
        System.out.println("Answer is : " + answer);
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int unique = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != unique){
                unique = nums[i];
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return index;
    }
}
//int index = 0;
//HashSet<Integer> unique = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//        if(!unique.contains(nums[i])){
//        unique.add(nums[i]);
//int temp = nums[index];
//nums[index] = nums[i];
//nums[i] = temp;
//index++;
//        }
//        }
//        return index;