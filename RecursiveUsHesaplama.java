import java.util.Scanner;

public class RecursiveUsHesaplama {
    static int usBulma(int x, int y){

        if(y==0){
            return 1;
        }
        return x* usBulma(x,y-1);
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int taban=scanner.nextInt();
        System.out.print("Us degeri giriniz : ");
        int us=scanner.nextInt();
        int sonuc= usBulma(taban,us);
        System.out.println("Sonuc : "+sonuc);
    }
   
}
