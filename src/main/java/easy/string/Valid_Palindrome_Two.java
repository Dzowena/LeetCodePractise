package easy.string;

public class Valid_Palindrome_Two {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
    }

    public static boolean validPalindrome(String s) {
        int first = 0, last = s.length() - 1;
        while (s.charAt(first) == s.charAt(last) && first <= last) {
            first++;
            last--;
        }
        if(first > last)
            return true;
        return (isPalindrome(s.substring(0, last) + s.substring(last + 1)) || isPalindrome(s.substring(0, first) + s.substring(first + 1)) );
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
