package easy.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Assign_Cookies {
    public static void main(String[] args) {

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0, cookieIndex = 0 , childIndex = 0;
        while(cookieIndex < s.length && childIndex < g.length){
            if(g[childIndex] <= s[cookieIndex]){
                answer++;
                cookieIndex++;
                childIndex++;
            }else cookieIndex++;
        }
        return answer;
    }
}
