/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.println("Lutfen Matematik notunuzu girininiz:");
        matematik=scan.nextInt();

        System.out.println("Lutfen Fizik notunuzu girininiz:");
        fizik=scan.nextInt();

        System.out.println("Lutfen Kimya notunuzu girininiz:");
        kimya=scan.nextInt();

        System.out.println("Lutfen Turkce notunuzu girininiz:");
        turkce=scan.nextInt();

        System.out.println("Lutfen Tarih notunuzu girininiz:");
        tarih=scan.nextInt();

        System.out.println("Lutfen Muzik notunuzu girininiz:");
        muzik=scan.nextInt();

        int toplam=(matematik+fizik+kimya+turkce+tarih+muzik);
        double ortalama=toplam/6.0;
        System.out.println("ORTALAMANIZ:"+ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı.";
        System.out.println(sonuc);



    }
}
