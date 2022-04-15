import java.util.Arrays;
import  java.util.Scanner;
public class MatrisTranspozu {
    static void matrisOlustur(int[][]arr){
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {

                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }

    }
    

    static  void transpozHesapla(int[][]arr){
        for (int i=0; i< arr[i].length;i++){
            for(int j=0;j< arr.length;j++)
            {

                System.out.print(+arr[j][i]+" ");

            }
            System.out.println();

        }

    }


    public static void main(String[] args) {
        int [][] list = {{1,2},{3,4},{5,6}};
        matrisOlustur(list);
        System.out.println("----MATRISIN TRANSPOZU----");
        transpozHesapla(list);


    }
}
