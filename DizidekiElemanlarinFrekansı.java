import java.util.Arrays;

public class DizidekiElemanlarinFrekansı {
    static boolean tekrarVarMi(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void print(int[]arr,int sayac){
        for (int i=0; i<arr.length; i++)
        System.out.println(arr[i] + " sayisi " +  sayac + " kere tekrar edildi");
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int[] tekrarEden = new int[list.length];
        int sayac = 0, baslangicIndeksi = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    sayac++;
                }
            }
            if (!tekrarVarMi(tekrarEden,list[i])){
                tekrarEden[baslangicIndeksi++] = list[i];
                print(new int[]{list[i]},sayac);
            }
            sayac = 0;

        }

    }
    }

