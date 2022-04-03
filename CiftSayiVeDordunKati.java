import java.util.Scanner;
public class CiftSayiVeDordunKati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Sayi giriniz: ");
            sayi = scan.nextInt();
            if (sayi%4==0) {
                toplam += sayi;
            }
        }while(sayi%2==0);
        System.out.print("Dordun  katlarinin toplami : " + toplam);


    }
}
