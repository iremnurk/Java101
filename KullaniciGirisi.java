/*Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
"Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String kullaniciAdi , sifre ,cevap ,yeniSifre;

        System.out.println("Lutfen kullanici adinizi girin:");
        kullaniciAdi=scan.nextLine();
        System.out.println("Lutfen sifreni girin:");
        sifre=scan.nextLine();

        if (kullaniciAdi.equals("patika") &&(sifre.equals("java123")) ){
            System.out.println("Giris yaptiniz!");
        }else {
            System.out.println("Bilgileriniz yanlis!");
            System.out.print("Sifrenizi yenilemek ister misiniz:evet / hayir cevabinizi yazin:");
            cevap =scan.nextLine();
            if (cevap.equals("evet")){
                System.out.print("Lutfen yeni sifrenizi girin:");
                yeniSifre=scan.nextLine();
                if (yeniSifre.equals("java123")){
                    System.out.println("Yeni sifre eski sifre ile ayni olamaz");
                    System.out.println("Tekrar olusturmak istediginiz sifreyi yaziniz:");
                    yeniSifre=scan.nextLine();
                    if (yeniSifre.equals("java123")){
                        System.out.println("Yeni sifre eski sifre ile ayni olamaz");
                    }else {
                        System.out.println("Yeni sifre basarili bir sekilde olusturuldu.");
                    }

                }else{
                    System.out.println("Yeni sifre olusturuldu.");
                }

            }
            else if (cevap.equals("hayir")){
                System.out.println("Sifrenizi yenilememek istediginizi bildirdiniz.");
            }

        }


    }
}
