public class AsalSayi {
    public static void main(String[] args) {
        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int control = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    control = 1;
                    break;
                }
            }

            if(control==0)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }

    }
}
