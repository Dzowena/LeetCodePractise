package easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class Minimum_Common_Value {
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,1,2}, new int[]{2,4}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j])
                return nums1[i];
            if(nums1[i] > nums2[j])
                j++;
            else i++;
        }
        return -1;
    }
}


//first solution
//HashSet<Integer> values = new HashSet<>();
//        for(int i = 0; i < nums1.length; i++)
//        values.add(nums1[i]);
//        for(int i = 0; i < nums2.length; i++)
//        if(values.contains(nums2[i]))
//        return nums2[i];
//        return -1;