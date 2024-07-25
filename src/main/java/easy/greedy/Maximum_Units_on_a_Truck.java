package easy.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Units_on_a_Truck {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int answer = 0;
        int[] unitCount = new int[1001];
        for(int[] boxCount : boxTypes){
           unitCount[boxCount[1]] += boxCount[0];
        }
        for(int i = unitCount.length - 1; i >= 0; i--){
           if(unitCount[i] == 0)
               continue;
           int num = Math.min(unitCount[i], truckSize);
           answer += num * i;
           truckSize -= num;
           if(truckSize == 0)
               break;
       }
        return answer;
    }
}
// secondary solution
//int answer = 0;
//        Arrays.sort(boxTypes, new Comparator<int[]>() {
//    @Override
//    public int compare(int[] a, int[] b) {
//        return Integer.compare(b[1], a[1]);
//    }
//});
//        for(int i = 0; i < boxTypes.length; i++){
//        if(truckSize > boxTypes[i][0]){
//truckSize -= boxTypes[i][0];
//answer += boxTypes[i][0] * boxTypes[i][1];
//        }else {
//answer +=  truckSize * boxTypes[i][1];
//        break;
//        }
//        }
//        return answer;