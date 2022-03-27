/*ÖDEV MANAV KASA PROGRAMI
Java ile kullanıcıların manavdan almış oldukları ürünlerin
 kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int armutkilo,elmakilo,domateskilo,muzkilo,patlicankilo;
        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.0,toplam;

        System.out.print("Armut kac kilo?:");
        armutkilo=scan.nextInt();
        System.out.print("Elma kac kilo?:");
        elmakilo=scan.nextInt();
        System.out.print("Domates kac kilo?:");
        domateskilo=scan.nextInt();
        System.out.print("Muz kac kilo?:");
        muzkilo=scan.nextInt();
        System.out.print("Patlican kac kilo?:");
        patlicankilo=scan.nextInt();

        toplam=(elma*elmakilo)+(armut*armutkilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.print("Toplam Tutar: "+toplam);



    }
}
