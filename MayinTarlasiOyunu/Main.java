import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("MAYIN TARLASI OYUNUNA HOSGELDİNİZ");
        System.out.println("Oyun Açıklaması: -1 ile gösterilen yerler mayınlardır ");
        System.out.println("Lutfen Secimlerinizde Dikkatli Olun");
        System.out.print("Oynamak İstediginiz Satır sayisini Giriniz :");
        int satir=scan.nextInt();
        System.out.print("Oynamak İstediginiz Satır sayisini Giriniz :");
        int sutun=scan.nextInt();
        MineSweeper mayinTarlasi=new MineSweeper(satir,sutun);
        mayinTarlasi.run();
    }
}
