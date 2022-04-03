import java.util.Scanner;
public class UcveDordeTamBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int sayac = 0,toplam=0;
        for (int i =1; i<=sayi ; i++) {
            if(i%3==0 && i%4==0) {
                    sayac+= 1;
                    toplam+=i;

            }
        }
        System.out.println("uce ve dorde tam bolunenlerin ortalamasi "+(toplam / sayac));

    }
}
