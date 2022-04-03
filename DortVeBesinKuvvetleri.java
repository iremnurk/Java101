import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i*=4){
            System.out.println("4 un kuvveti : " + i );
        }
        for (int j = 1; j<= sayi; j*=4){
            System.out.println("5 in kuvveti : " + j );
        }
    }
}

