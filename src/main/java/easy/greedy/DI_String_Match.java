package easy.greedy;

public class DI_String_Match {
    public static void main(String[] args) {

    }

    public int[] diStringMatch(String s) {
        int D = s.length(), I = 0, length = s.length();
        int[] answer = new int[length + 1];
        for(int i = 0; i < length; i++){
            if(s.charAt(i) == 'D'){
                answer[i] = D;
                D--;
            }else {
                answer[i] = I;
                I++;
            }
        }
        answer[length] = D;
        return answer;
    }

}
