/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)      */

import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        double u,alan;

        System.out.print("Birinci Kenarı Girin:");
        a=scan.nextInt();
        System.out.print("İkinci Kenarı Girin:");
        b=scan.nextInt();
        System.out.print("Ucuncu Kenarı Girin:");
        c=scan.nextInt();

        u= ((a+b+c)/2.0);
        System.out.println("Ucgenin Cevresi"+2.0*u);

        alan = Math.sqrt(u * ( u - a ) * (u - b) * (u - c));
        System.out.println("Ucgenin alani : " + alan );


    }

}
