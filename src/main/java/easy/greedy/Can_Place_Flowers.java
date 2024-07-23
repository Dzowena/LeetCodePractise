package easy.greedy;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(arr, 0));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean last = true;
        for(int i = 0; i < flowerbed.length - 1; i++){
            if(flowerbed[i] == 0){
                if(flowerbed[i + 1] == 0 && last){
                    n--;
                    flowerbed[i] = 1;
                    last = false;
                }else last = true;
            }else last = false;
            if(n <= 0)
                return true;
        }
        if(flowerbed[flowerbed.length - 1] == 0 && last)
            n--;
        if(n <= 0)
            return true;
        else return false;
    }
}
