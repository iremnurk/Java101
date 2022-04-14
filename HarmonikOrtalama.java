import java.util.Scanner;
public class HarmonikOrtalama {

    //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

    static void harmonikSeriOlusturma(double[]arr){
        double toplam=0.0;
        for(int i=0;i<arr.length;i++){
             arr[i]=(1.0/(i+1.0));
             toplam+=arr[i];

        }
        System.out.println("Harmonik Seri Ortalamasi "+(toplam / arr.length));

    }
    static void printHarmonik(double[]arr){
        for (int j=0; j<arr.length; j++){
            arr[j]=(1.0/(j+1.0));
            System.out.println("harmonikList["+j+"] = "+arr[j]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Olusturacaginiz Harmonik Serisinin n  degerini giriniz: ");
        int sayi = scan.nextInt();
        double harmonikList[]=new double[sayi];

        System.out.println("-----------------");
        System.out.println("Harmonik Seri ");
        printHarmonik(harmonikList);

        harmonikSeriOlusturma(harmonikList);   //Harmonik Seri Ortalama


    }
}
