/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sicaklik;
        System.out.println("Sicaklik degerini giriniz:");
        sicaklik=scan.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        }else if (sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (sicaklik>=15 && sicaklik<=25){
            System.out.println("Piknige gidebilirsiniz.");
        }else {
            System.out.println("Yuzmeye gidebilirsiniz:");
        }

    }
}
