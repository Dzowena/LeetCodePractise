package easy.hashtable;

public class Count_Elements_With_Maximum_Frequency {
    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{10,12,11,9,6,19,11}));
    }

    public static int maxFrequencyElements(int[] nums) {
        int max = 0, index = 0;
        int[] arr1 = new int[101];
        for(int i = 0; i < nums.length; i++)
            arr1[nums[i]]++;
        for(int i = 0; i < 101; i++)
            if(arr1[i] > max) {
                max = arr1[i];
                index = 1;
            }
            else if(arr1[i] == max)
                index++;
        return max * index;
    }
}
