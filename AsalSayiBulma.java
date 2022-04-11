import java.util.Scanner;

public class AsalSayiBulma {
    static boolean asalMi(int sayi) {
        int sayac = 0;                              
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (asalMi(sayi)) {
            System.out.println(sayi+"Girilen sayi asal bir sayidir.");
        } else {
            System.out.println(sayi+"Girilen sayi asal bir sayi degildir.");
        }
    }}

