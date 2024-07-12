package easy.string;

public class Roman_To_Integer {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        int answer = 0;
        int lastNumber = romanAsInt(s.charAt(0));
        for(int i = 0; i < s.length(); i++){
            int temp = romanAsInt(s.charAt(i));
            if(temp > lastNumber)
                answer += temp -  2 * lastNumber;
            else answer += temp;
            lastNumber = temp;
        }
        return answer;
    }

    public static int romanAsInt(Character c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
