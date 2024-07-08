package easy.string;

public class Valid_Palindrome_Two {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        if(s.isEmpty())
            return true;
        String temp = s;
        int first = 0, last = s.length() - 1, count = 0;
        while(first <= last){
            if((temp.charAt(first) != temp.charAt(last)) && count == 0){
                temp = s.substring(0, first) + s.substring(first + 1);
                count++;
                last--;
                continue;
            }else if((temp.charAt(first) != temp.charAt(last)) && count == 1){
                temp = s.substring(0, last) + s.substring(last + 1);
                last--;
                count++;
            }else if(count == 2)
                return false;
            first++;
            last--;
        }
        return true;
    }
}
