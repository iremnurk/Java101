import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int satir, sutun, boyut;
    int harita[][];
    int oyunAlani[][];
    boolean isGame = true;

    MineSweeper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        this.harita = new int[satir][sutun];
        this.oyunAlani = new int[satir][sutun];
        this.boyut = satir * sutun;

    }


    public void mayinlariOlustur() {
        int randSatir,randSutun, sayac = 0;
        while (sayac != (boyut / 4)) {
            randSatir = rand.nextInt(satir);
            randSutun = rand.nextInt(sutun);

            if (harita[randSatir][randSutun] != -1) {
                harita[randSatir][randSutun] = -1;
                sayac++;
            }

        }

    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void mayinKontrolu(int x, int y) {
        if(harita[x][y]==0){
            if ( y>0 && harita[x][y - 1] == -1) {
                oyunAlani[x][y]++;
            }
            if ( y<sutun -1 && harita[x][y + 1] == -1) {
                oyunAlani[x][y]++;
            }
            if (x>0&& harita[x - 1][y] == -1) {
                oyunAlani[x][y]++;
            }

            if (x<satir -1 && harita[x + 1][y] == -1) {
                oyunAlani[x][y]++;
            }

            if(oyunAlani[x][y]==0)
            {
                oyunAlani[x][y]=-2;
            }
        }

    }
    public void run() {
        int secilenSatir, secilenSutun,basari=0;
        mayinlariOlustur();
        print(harita);
        System.out.println("==Oyun Basladi==");
        while (isGame == true) {
            print(oyunAlani);
            System.out.println("Satir degeri :");
            secilenSatir = scan.nextInt();
            System.out.println("Sutun degeri :");
            secilenSutun = scan.nextInt();
            if(secilenSatir<0 || secilenSatir>satir)
            {
                System.out.println("Geçersiz koordinat");
                continue;
            }
            if(secilenSutun<0 || secilenSutun>sutun)
            {
                System.out.println("==Geçersiz koordinat==");
                continue;
            }
            if (harita[secilenSatir][secilenSutun] == -1) {
                System.out.println("==Kaybettiniz==");
                isGame = false;

            } else if (harita[secilenSatir][secilenSutun] != -1) {
                basari++;
                if(basari== boyut -(boyut /4))
                {
                    System.out.println("==Başarılı Kazandınız==");
                    break;
                }
                mayinKontrolu(secilenSatir, secilenSutun);
            }

        }
    }
}