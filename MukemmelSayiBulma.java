import java.util.Scanner;
public class MukemmelSayiBulma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num,total=0;
        System.out.print("Bir sayi giriniz:");
        num=scan.nextInt();

        int i=0;

        while (i<=num){
            i++;
            if (num%i==0){
                total+=i;
            }
        }
        int mukemmelSayi=total-num;

        if (mukemmelSayi==num){
            System.out.println(num+" Mukemmel sayidir.");
        }else {
            System.out.println(num+" Mukemmel sayi degildir.");
        }



    }
}
