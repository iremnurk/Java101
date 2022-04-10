import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {
        int sayi;

        Scanner scan = new Scanner(System.in);

        System.out.print("Basamak Sayisi: ");
        sayi = scan.nextInt();

        for (int i=0; i<sayi; i++) {
            for (int j=0; j<i + 1; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*(sayi - i) - 1; k++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
