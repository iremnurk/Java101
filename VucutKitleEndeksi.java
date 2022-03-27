/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)*/

import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vucut Kitle Indeksiniz : " + indeks);
    }
}
