package easy.hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate_II {
    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(i-mp.get(nums[i])) <= k) return true;
            }
            mp.put(nums[i], i);
        }
        return false;
    }
}

//first solution
//int i = 0;
//HashSet<Integer> hset = new HashSet<>();
//        for(int j = 0; j < nums.length; j++){
//        if(!hset.add(nums[j]))
//        return true;
//        if(hset.size() >= k + 1)
//        hset.remove(nums[i++]);
//        }
//                return false;
