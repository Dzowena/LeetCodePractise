package easy.greedy;

import java.util.Arrays;

public class Minimum_Number_Of_Pushes_To_Type_Word_1 {
    public static void main(String[] args) {

    }

    public static int minimumPushes(String word) {
        int answer = 0;
        int length = word.length();
        int cycles = length / 8;
        int odd = length % 8;
        while(cycles > 0) {
            answer += cycles * 8;
            cycles--;
        }
        if(odd == 0)
            return answer;
        else return answer + ((length / 8 + 1) * odd);
    }

}
