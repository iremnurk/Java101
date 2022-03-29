import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n1, n2, secim;
        System.out.print("Lutfen ilk sayiyi giriniz:");
        n1=scan.nextInt();
        System.out.print("Lutfen ilk sayiyi giriniz:");
        n2=scan.nextInt();
        System.out.println("Lutfen yapmak istediginiz secimi yazin:1/TOPLAMA 2/CIKARMA 3/CARPMA 4/BOLME");
        secim=scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("TOPLAMA:"+(n1+n2));
                break;
            case 2:
                System.out.println("CIKARMA:"+(n1-n2));
                break;
            case 3:
                System.out.println("CARPMA:"+(n1*n2));
                break;
            case 4:
                if( n2!=0 ){
                    System.out.println("BOLME:"+(n1/n2));
                }
                else{
                    System.out.println("Sayi sifira bolunmez!");
                }
                break;
            default:
                System.out.println("Lutfen gecerli bir islem seciniz");

        }


    }
}
