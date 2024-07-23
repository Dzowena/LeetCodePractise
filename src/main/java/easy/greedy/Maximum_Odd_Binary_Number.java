package easy.greedy;

public class Maximum_Odd_Binary_Number {
    public static void main(String[] args) {

    }

    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int zero = 0, one = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0')
                zero++;
            else one++;
        }
        for(int i = 0; i < one - 1; i++)
            sb.append("1");
        for(int i = 0; i < zero; i++)
            sb.append("0");
        sb.append("1");
        return sb.toString();
    }
}
