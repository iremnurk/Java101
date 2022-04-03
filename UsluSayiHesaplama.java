import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi girin:");
        n=input.nextInt();
        System.out.print("Uso olacak sayiyi girin:");
        k=input.nextInt();

        int total =1;
        for (int i=1; i<=k; i++){
            total *=n;
        }
        System.out.print("Cevap="+total);
    }
}
