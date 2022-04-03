import java.util.Scanner;
/*Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!) */
public class Kombinasyon {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n,r,nFak=1,rFak=1,farkFak=1;


        System.out.print("N in r li kombinasyonu icin N sayisini girin:");
        n=scan.nextInt();
        System.out.print("N in r li kombinasyonu icin r sayisini girin:");
        r=scan.nextInt();
        int fark=n-r;
        for (int i=1; i<=n; i++){
            nFak=nFak*i;
        }
        for (int j=1; j<=r; j++){
            rFak=rFak*j;
        }
        for (int z=1; z<=fark; z++){
            farkFak=farkFak*z;
        }
        int formul=(nFak/(rFak*farkFak));
        System.out.println("C("+n+","+r+")="+formul);
    }
}
