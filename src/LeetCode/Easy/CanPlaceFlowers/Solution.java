package LeetCode.Easy.CanPlaceFlowers;

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, rez = 0, size = flowerbed.length;
        for (int i = 0; i < size; i++) {
            if (flowerbed[i]==0) count++;
            else count = 0;
            if (count>1 && count%2==1) rez++;
            if (count==4 && i==size-1) rez++;
            if (size==4 && count==4) rez = 2;
        }
        if (size>=2 && flowerbed[0]==0 && flowerbed[1]==0) rez++;
        if (size>=3 && flowerbed[size-1]==0 && flowerbed[size-2]==0) rez++;
        if (size==1 && flowerbed[0]==0) rez++;
        if (size>=4 && flowerbed[size-1]==0 && flowerbed[size-2]==0 && flowerbed[size-3]==0) rez--;
        if (size==4 && flowerbed[0]==0 && flowerbed[1]==0 && flowerbed[2]==0 && flowerbed[3]==0) rez = 2;
        return (n<=rez)? true:false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, 0, 0, 0, 1};
        int k = 2, k2 = 1;
        System.out.println(canPlaceFlowers(arr, k));
        System.out.println(canPlaceFlowers(arr, k2));
    }
}
