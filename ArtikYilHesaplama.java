import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Yili giriniz : ");
        yil = scan.nextInt();

        if ((yil % 100 == 0) && (yil % 400 == 0)) {
            System.out.println(yil + " artik bir yildir.");
        } else if ((yil % 100 == 0) && (yil % 400 != 0)) {
            System.out.println(yil + " artik bir yil degildir.");
        } else if (yil % 4 == 0) {
            System.out.println(yil + " artik bir yildir.");
        } else {
            System.out.println(yil + " artik bir yil degildir.");
        }
    }
}
