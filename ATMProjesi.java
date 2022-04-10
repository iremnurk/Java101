import java.util.Scanner;
public class ATMProjesi {


    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        int girisHakki = 3, bakiye = 1500, secim;

        Scanner scanner = new Scanner(System.in);
        while (girisHakki>0) {
            System.out.print("Kullanici Adinizi Girin : ");
            kullaniciAdi = scanner.nextLine();
            System.out.print("Sifrenizi Giriniz : ");
            sifre = scanner.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Kodluyoruz Bankaya Hoşgeldiniz");
                do {
                    System.out.print("" +
                            "Para Yatırma : 1\n" +
                            "Para Çekme : 2\n" +
                            "Bakiye Sorgula : 3\n" +
                            "Çıkış Yap : 4\n");
                    System.out.println("Yapmak istediginiz islemi seciniz :");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediginiz miktarı giriniz : ");
                            int yatirilan = scanner.nextInt();
                            bakiye += yatirilan;
                            System.out.println("Isleminiz gerceklestirildi. Guncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.println("Cekmek istediğiniz miktarı giriniz.");
                            int cekilen = scanner.nextInt();
                            if (cekilen > bakiye)
                                System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + bakiye);
                            else {
                                bakiye -= cekilen;
                                System.out.println("Isleminiz gerceklestirildi. Kalan bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Cıkıs yapildi.");
            } else {
                girisHakki--;
                System.out.println("Hatali kullanici adi veya sifre girdiniz. Tekrar deneyiniz:");
                if (girisHakki == 0) {
                    System.out.println("Hesabiniz bloke olmustur.");

                }
            }
        }


    }
}