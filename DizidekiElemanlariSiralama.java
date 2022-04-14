import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariSiralama {
    static void diziOlusturma(int[]arr){
        Scanner scan=new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+". Elemani :");
            int deger=scan.nextInt();
            arr[i]=deger;
        }

    }
    public static String sortArray(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
       int dizininBoyutu;
        Scanner scan=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        dizininBoyutu=scan.nextInt();
        int list[]=new int[dizininBoyutu];
        diziOlusturma(list);
        System.out.println("Siralama: "+sortArray(list));
    }
}
