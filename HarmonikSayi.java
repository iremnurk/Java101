import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double toplam=0.0;
        System.out.print("N sayi degerini giriniz: ");
        int sayi = scan.nextInt();
        

        for(int i=1;i<=sayi;i++){
            toplam += (1.0/i);
        }
        System.out.println(toplam);
    }
}
