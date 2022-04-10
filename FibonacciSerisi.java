import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        int s1=0,s2=1,n,elemanSayi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Eleman sayisi giriniz : ");
        elemanSayi = scan.nextInt();

        System.out.println(s1);
        System.out.println(s2);

        for(int i=1; i < elemanSayi ; i++){

            n = s1 + s2;
            System.out.println(n);
            s1 = s2;
            s2 = n;
        }

    }
}
