import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
     int mesafe,yas,yolculukTipi;
     double mesafeUcret=0.10,normalTutar,yasİndirimi,
             yasİndirimOrani,gidisDonusIndirimi,toplamTutar,indirimliTutar;



     Scanner scan=new Scanner(System.in);

        System.out.println("Mesafeyi km turunden giriniz:");
        mesafe=scan.nextInt();
        if (mesafe<=0){
            System.out.println("Hatali veri girdiniz");
        }else {
            System.out.println("Girilen mesafe:"+mesafe);
            System.out.println("Yasinizi giriniz:");
            yas=scan.nextInt();
            if (yas<=0){
                System.out.println("Hatali veri girdiniz");
            }else {
                System.out.println("Girilen yas:"+yas);
            }
            System.out.println("Yolculuk tipini giriniz(1 =>Tek Yon, 2=>Gidis Donus");
            yolculukTipi=scan.nextInt();
            if (yolculukTipi<=0 || yolculukTipi>=3){
                System.out.println("Hatali veri girdiniz");
            }else {
                normalTutar=mesafe*mesafeUcret;
                System.out.println("Normal Tutar"+normalTutar);

                if (yas<12){
                    yasİndirimOrani=0.50;
                }else if (yas>=12 && yas<24){
                    yasİndirimOrani=0.10;
                }else if (yas>65){
                    yasİndirimOrani=0.30;
                }else{
                    yasİndirimOrani=0.0;
                }
                yasİndirimi=normalTutar*yasİndirimOrani;
                System.out.println("Yas Indirimi:"+yasİndirimi);

                indirimliTutar=normalTutar-yasİndirimi;
                System.out.println("Indirilimli Tutar:"+indirimliTutar);
                if (yolculukTipi==2){
                    gidisDonusIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-gidisDonusIndirimi)*2;
                    System.out.println("Toplam Tutar"+toplamTutar);


                }else if (yolculukTipi==1){
                    toplamTutar=indirimliTutar;
                    System.out.println("Toplam Tutar"+toplamTutar);
                }
            }


        }

    }
}
