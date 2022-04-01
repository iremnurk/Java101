import java.util.Scanner;
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
public class SinifGecme {
    public static void main(String[] args) {
     int mat,fizik,turkce,kimya,muzik,toplam=0,sayac=0;
     double ortalama;
     Scanner input=new Scanner(System.in);

     System.out.println("Matematik notunuzu girin:");
     mat=input.nextInt();

     if (mat>=0 && mat<=100){
         toplam+=mat;
         sayac++;

     }else {
         System.out.println("Girilen not 0 ile 100 arasinda degildir.Ortalamaya eklenmeyecektir.");
     }

        System.out.println("Fizik notunuzu girin:");
        fizik=input.nextInt();

        if (fizik>=0 && fizik<=100){
            toplam+=fizik;
            sayac++;

        }else {
            System.out.println("Girilen not 0 ile 100 arasinda degildir.Ortalamaya eklenmeyecektir.");
        }
        System.out.println("Turkce notunuzu girin:");
        turkce=input.nextInt();

        if (turkce>=0 && turkce<=100){
            toplam+=turkce;
            sayac++;

        }else {
            System.out.println("Girilen not 0 ile 100 arasinda degildir.Ortalamaya eklenmeyecektir.");
        }

        System.out.println("Kimya notunuzu girin:");
        kimya=input.nextInt();

        if (kimya>=0 && kimya<=100){
            toplam+=kimya;
            sayac++;

        }else {
            System.out.println("Girilen not 0 ile 100 arasinda degildir.Ortalamaya eklenmeyecektir.");
        }
        System.out.println("Muzik notunuzu girin:");
        muzik=input.nextInt();

        if (muzik>=0 && muzik<=100){
            toplam+=mat;
            sayac++;

        }else {
            System.out.println("Girilen not 0 ile 100 arasinda degildir.Ortalamaya eklenmeyecektir.");
        }

        ortalama=toplam/sayac;
        if (ortalama>=55){
            System.out.println("Sinifi gectiniz");
        }
        else {
            System.out.println("Sinifi gecemediniz.");
        }
        System.out.println("Ortalamaniz:"+ortalama);
    }
}

