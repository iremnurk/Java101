import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MinMaxBulma {
    public static void main(String[] args) {

        int sayi, min=0, max =0, girilecekSayiAdedi;
        Scanner input = new Scanner(System.in);

        System.out.print("Kac adet sayi giriceksiniz?  :");
        girilecekSayiAdedi = input.nextInt();

            for (int i = 1; i <= girilecekSayiAdedi; i++) {
                System.out.print(i + ". sayi  :");
                sayi = input.nextInt();
                if (i == 1) {
                    max = sayi;
                    min = sayi;
                } else {
                    if (sayi >= max)
                        max = sayi;
                    if (sayi <= min)
                        min = sayi;
                }
            }
            System.out.println("Minumum sayi " + min);
            System.out.println("Maximum sayi " + max);








    }
}
