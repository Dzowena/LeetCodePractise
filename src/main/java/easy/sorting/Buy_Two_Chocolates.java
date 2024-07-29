package easy.sorting;

import java.util.Arrays;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {

    }

    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int x : prices){
            if(x < min1){
                min2 = min1;
                min1 = x;
            }else if(x < min2)
                min2 = x;
        }
        if(min1 + min2 <= money)
            return money - (min1 + min2);
        return money;
    }
}
//first solution
//Arrays.sort(prices);
//        if(prices[0] + prices[1] > money)
//        return money;
//        else return money - (prices[0] + prices[1]);