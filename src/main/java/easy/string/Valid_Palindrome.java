package easy.string;

public class Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        int first = 0;
        int last = s.length() - 1;
        while(first <= last){
            if(!Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }else if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }else {
                if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
                    return false;
                }else {
                    first++;
                    last--;
                }
            }
        }
        return true;
    }
}

//version 1 -- worst
//StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//        if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
//        sb.append(s.charAt(i));
//        }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
//        sb.append((char)(s.charAt(i) + 'a' - 'A'));
//        }
//        }
//        for(int i = 0; i < sb.length() / 2; i++){
//        if(!(sb.toString().charAt(i) == sb.toString().charAt(sb.length() - 1 - i)))
//        return false;
//        }
//        return true;


//version 2 -- best
//StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//        if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
//        sb.append(s.charAt(i));
//        } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
//        sb.append((char) (s.charAt(i) + 'a' - 'A'));
//        }
//        }
//String answer = sb.toString();
//        for (int i = 0; i < answer.length() / 2; i++) {
//        if (answer.charAt(i) != answer.charAt(answer.length() - 1 - i))
//        return false;
//        }
//        return true;

//version 3
//String answer = s.toLowerCase();
//StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < answer.length(); i++){
//        if((answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z') || (answer.charAt(i) >= '0' && answer.charAt(i) <= '9')){
//        sb.append(answer.charAt(i));
//        }
//        }
//answer = sb.toString();
//        for(int i = 0; i < answer.length() / 2; i++){
//        if(answer.charAt(i) != answer.charAt(answer.length() - 1 - i))
//        return false;
//        }
//        return true;

//version 4
//StringBuilder sb1 = new StringBuilder();
//StringBuilder sb2 = new StringBuilder();
//       for(int i = 0; i < s.length(); i++){
//        if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
//        sb1.append(s.charAt(i));
//        }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
//        sb1.append((char) (s.charAt(i) + 'a' - 'A'));
//        }
//        if((s.charAt(s.length() - 1 - i) >= 'a' && s.charAt(s.length() - 1 - i) <= 'z') || (s.charAt(s.length() - 1 - i) >= '0' && s.charAt(s.length() - 1 - i) <= '9')){
//        sb2.append(s.charAt(s.length() - 1 - i));
//        }else if(s.charAt(s.length() - 1 - i) >= 'A' && s.charAt(s.length() - 1 - i) <= 'Z'){
//        sb2.append((char) (s.charAt(s.length() - 1 - i) + 'a' - 'A'));
//        }
//        }
//        if(sb1.toString().contentEquals(sb2))
//        return true;
//        else return false;