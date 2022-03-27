/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/

import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14, alan;
        int r,aci;

        System.out.print("Dairenin alaninin hesaplanmasi icin yaricap giriniz : ");
        r = scan.nextInt();
        System.out.print("Dairenin alaninin hesaplanmasi icin aci giriniz : ");
        aci = scan.nextInt();


        alan = (pi * (r*r)) * aci / 360;

        System.out.println("Yaricapi : " + r + " acisi : " + aci + "° olan dairenin alanı : " + alan);




    }
}
