package easy.arrays;

import java.util.Arrays;

public class Widest_Vertical_Area_Between_Two_Points_Cotaining_No_Points {
    public static void main(String[] args) {
    }

    public int maxWidthOfVerticalArea(int[][] points) {
        int answer = 0;
        int[] temp = new int[points.length];
        for(int i = 0; i < temp.length; i++){
            temp[i] = points[i][0];
        }
        Arrays.sort(temp);
        for(int i = 0; i < temp.length - 1; i++){
            if(temp[i + 1] - temp[i] > answer)
                answer = temp[i + 1] - temp[i];
        }
        return answer;
    }

}
