import java.util.Scanner;
public class BasmakSayilarininToplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Sayiyi giriniz:");
        sayi=scan.nextInt();

        while(sayi!=0) {
            int num=sayi%10;
            toplam+=num;
            sayi=sayi/10;

        }

        System.out.println("Basamak Sayilarinin toplami:"+toplam);
    }
}
