import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class SayiTahminiOyunu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();

        int randomNumber= rand.nextInt(100);
        System.out.println("Random Number: "+randomNumber);

        int right=0;
        int selected;

        for (int i=1; i<=5;i++){
            System.out.println("Sayiyi girin");
            selected=scan.nextInt();
            if (selected<0 || selected>99){
                System.out.println("Lutfen Gecerli Sayi Araliginda Deger Girin");
            }
            if (selected==randomNumber){
                System.out.println("Dogru Tahmin Sayi: "+selected);
                break;
            }
            else if(selected<randomNumber){
                System.out.println("Tahmin ettiginiz sayi gizli sayidan kucuktur");
                right++;
                System.out.println("Kalan Hak: "+(5-right));


            }
            else if(selected>randomNumber){
                System.out.println("Tahmin ettiginiz sayi gizli sayidan buyuktur");
                System.out.println("Kalan Hak: "+(5-right));


            }
            if (right==5){
                System.out.println("Kaybettiniz  Hakkiniz Kalmadi");
                break;
            }

        }


    }
}
