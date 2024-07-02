package easy.string;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        int length = 0;
        Arrays.sort(strs);
        if(strs[0].isBlank())
            return "";
        if(strs[strs.length - 1].length() > strs[0].length())
            length = strs[0].length();
        else length = strs[strs.length - 1].length();
        for(int i = 0; i < length; i++){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
                answer.append(strs[0].charAt(i));
            else return answer.toString();
        }
        return answer.toString();
    }

}
