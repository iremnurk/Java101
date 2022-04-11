import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void desenOlusturma(int sayi)
    {
        if (sayi<=0) {
            System.out.print(" "+sayi);
            return;
        }
        System.out.print(" "+sayi);
        desenOlusturma(sayi-5);
        System.out.print(" "+sayi);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("N Sayisi : ");
            n=inp.nextInt();
            System.out.print("Ciktisi : ");
            desenOlusturma(n);
            System.out.println("\n");
        }
}}
