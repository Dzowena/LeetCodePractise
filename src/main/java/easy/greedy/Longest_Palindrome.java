package easy.greedy;

import java.util.Arrays;
import java.util.HashMap;

public class Longest_Palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearthey"));
    }

    public static int longestPalindrome(String s) {
        int answer = 0, odd = 0;
        int[] arr = new int[58];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                answer += arr[i];
            else if(arr[i] % 2 == 1 && arr[i] != 1){
                answer += arr[i] - 1;
                odd = 1;
            }else if(arr[i] == 1)
                odd = 1;
        }
        return answer + odd;
    }
}

//first solution
//int answer = 0, odd = 0;
//boolean hasOdd = false;
//HashMap<Character, Integer> freqs = new HashMap<>();
//        for(int i = 0; i < s.length(); i++)
//        freqs.put(s.charAt(i), freqs.getOrDefault(s.charAt(i), 0) + 1);
//        for(int freq : freqs.values()){
//        if(freq % 2 == 0)
//answer += freq;
//            else {
//answer += freq - 1;
//hasOdd = true;
//        }
//        }
//        if(hasOdd)
//answer += 1;
//        return answer;