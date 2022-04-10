import java.util.Scanner;
public class EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1,n2;
        System.out.println("N1 sayisini giriniz:");
        n1=scan.nextInt();
        System.out.println("N2 sayisini giriniz:");
        n2=scan.nextInt();

        int ebob;
        int k=n1;
        while (k>=1){
            k--;
            if (n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println("EBOB= "+ebob);
                break;

            }

        }

        int i=1;
        while (i<=n1*n2){
            i++;
            if (i %n1==0 && i%n2==0){

                System.out.println("EKOK= "+i);
                break;

            }

        }


    }
}
