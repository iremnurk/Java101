import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumTarihi,kalan;
        String cinBurcu="";
        Scanner scan=new Scanner(System.in);
        System.out.print("Dogum yilinizi girin:");
        dogumTarihi=scan.nextInt();
        kalan=dogumTarihi%12;

        switch (kalan) {
            case 0:
               cinBurcu="Maymun";
                break;
            case 1:
                cinBurcu="Horoz";
                break;
            case 2:
                cinBurcu="Kopek";
                break;
            case 3:
                cinBurcu="Domuz";
                break;
            case 4:
                cinBurcu="Fare";
                break;
            case 5:
                cinBurcu="Okuz";
                break;
            case 6:
                cinBurcu="Kaplan";
                break;
            case 7:
                cinBurcu="Tavsan";
                break;
            case 8:
                cinBurcu="Ejderha";
                break;
            case 9:
                cinBurcu="Yilan";
                break;
            case 10:
                cinBurcu="At";
                break;
            case 11:
                cinBurcu="Koyun";
                break;
        }

        System.out.println("Cin Zodyagi Burcunuz: "+cinBurcu);
    }
}
