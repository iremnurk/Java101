import java.util.Scanner;
public class PalindromSayilar {
    static boolean isPalindrom(int number) {
        int temp=number, reverse=0, lastNumber;

        while(temp!=0) {
            lastNumber=temp%10;
            reverse=(reverse*10)+lastNumber;
            temp/=10;

        }

        if(number==reverse) {
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
        int num=input.nextInt();
        if (isPalindrom(num)){
            System.out.println(num+" Palindrom Sayidir");
        }else {
        System.out.println(num+" Palindrom Sayi Degildir");}


    }
}
