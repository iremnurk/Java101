import java.util.Scanner;

public class PalindromikKelime {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Bir Adet Kelimeyi Giriniz: ");
        String kelime=scanner.nextLine();
        System.out.println(isPalindrome(kelime));
    }

    static  boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        System.out.println("Palindromik Kelimedir");
        return true;
    }











     /*  static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }*/

}
