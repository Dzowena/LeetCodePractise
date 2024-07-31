package easy.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Degree_of_an_Array {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int maxcount=Integer.MIN_VALUE;
        for(int j:count.keySet()){
            maxcount=Math.max(maxcount,count.get(j));
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int windowsize=Integer.MIN_VALUE;
        int res=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<nums.length){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            windowsize=Math.max(windowsize,hm.get(nums[j]));
            while(windowsize==maxcount){
                res=Math.min(res,j-i+1);
                hm.put(nums[i],hm.get(nums[i])-1);
                if(hm.get(nums[i])==0)
                    hm.remove(nums[i]);
                if(nums[i]==nums[j])
                    windowsize--;
                i++;
            }
            j++;
        }
        return res;
    }
}
