import java.util.Scanner;
/*1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı*/

public class GelismisHesapMakinesi {

    static int toplama(int a,int b){
        int result=a+b;
        System.out.println("Toplama islemi sonucu: "+result);
        return result;
    }
    static int cikarma(int a,int b){
        int result=a-b;
        System.out.println("Cikarma islemi sonucu: "+result);
        return result;
    }
    static int carpma(int a,int b){
        int result=a*b;
        System.out.println("Carpma islemi sonucu: "+result);
        return result;
    }
    static int bolme(int a,int b){
        if (b==0){
            System.out.println("İkinci sayi 0'dan farkli olmali");
            return 0;
        }
        int result=a/b;
        System.out.println("Bolme islemi sonucu: "+result);
        return result;
    }
    static int usluSayi(int a, int b){
        int result=1;
        for (int i=1; i<=b ; i++){
            result*=a;
        }
        System.out.println("Uslu sayi sonucu"+result);
        return result;
    }
    static int faktoriyel(int a){
        int result=1;
        for (int i=1; i<=a; i++){
            result*=i;
        }
        System.out.println("Faktoriyel sayi sonucu"+result);
        return result;
    }
    static int modAlma(int a,int b){
        int result=a%b;
        System.out.println("Mod islemi sonucu: "+result);
        return result;
    }

    static void dikdortgenAlanveCevre(int a,int b){
        int cevre,alan;
        cevre=2*(a+b);
        alan=a*b;
        System.out.println("cevre:"+cevre);
        System.out.println("alan"+alan);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz :");
            select = scan.nextInt();
            int a=0,b = 0;
            if (select== 1){
            System.out.println("Toplama islemi icin");
            System.out.print("Ilk Sayiyi girin: ");
            a=scan.nextInt();
            System.out.println("Ikinci Sayiyi girin: ");
            b=scan.nextInt();
            }else if (select==2){
                System.out.println("Cikarma islemi icin");
                System.out.print("Ilk Sayiyi girin: ");
                a=scan.nextInt();
                System.out.println("Ikinci Sayiyi girin: ");
                b=scan.nextInt();
            }
            else if (select==3){
                System.out.println("Carpma islemi icin");
                System.out.print("Ilk Sayiyi girin: ");
                a=scan.nextInt();
                System.out.println("Ikinci Sayiyi girin: ");
                b=scan.nextInt();
            }
            else if (select==4){
                System.out.println("Bolme islemi icin");
                System.out.print("Bolunen Sayiyi girin: ");
                a=scan.nextInt();
                System.out.println("Bolen Sayiyi girin: ");
                b=scan.nextInt();
            }
            else if (select==5){
                System.out.println("Uslu sayi islemi icin");
                System.out.print("Tabani girin: ");
                a=scan.nextInt();
                System.out.println("Ussu girin: ");
                b=scan.nextInt();
            }

            else if (select==6){
                System.out.println("Faktoriyelini almak istediginiz sayiyi girin:");
                a=scan.nextInt();
            }
            else if (select==7){
                System.out.println("Mod alma islemi icin");
                System.out.print("İlk sayiyi girin: ");
                a=scan.nextInt();
                System.out.println("İkinci sayiyi girin: ");
                b=scan.nextInt();
            }
            else if (select==8){
                System.out.println("Dikdörtgen alan ve cevre hesabi icin");
                System.out.print("Kisa kenari girin: ");
                a=scan.nextInt();
                System.out.println("Uzun kenari girin: ");
                b=scan.nextInt();
            }
            

            switch (select) {
                case 1:
                    toplama(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    usluSayi(a,b);
                    break;
                case 6:
                    faktoriyel(a);
                    break;
                case  7:
                    modAlma(a,b);
                    break;
                case  8:
                    dikdortgenAlanveCevre(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}
