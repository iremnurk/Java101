import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int gun;
        String ay, burc = "";
        boolean isError = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen burcunuzu hesaplamak icin dogdunuz ayi yazin: ");
        ay = scan.next();

        System.out.print("Dogdunuz gunu lutfen giriniz : ");
        gun = scan.nextInt();


        if (ay.equals("Ocak") || ay.equals("ocak")|| ay.equals("OCAK")){
            if (gun <=21 && 1 <= gun){
                burc = "Oğlak";
            }else if(gun <= 31){
                burc = "Kova";
            }else{
                isError = true;
            }
        }else if(ay.equals("SUBAT")|| ay.equals("ŞUBAT")||ay.equals("Subat") || ay.equals("subat") || ay.equals("Şubat") || ay.equals("şubat" )){
            if (gun <=19 && 1 <= gun){
                burc = "Kova";
            }else if(gun <= 28){
                burc = "Balık";
            }else{
                isError = true;
            }
        }else if(ay.equals("MART") || ay.equals("Mart") || ay.equals("mart")){
            if (gun <=20 && 1 <= gun){
                burc = "Balık";
            }else if(gun <= 31){
                burc = "Koç";
            }else{
                isError = true;
            }
        }else if(ay.equals("NİSAN") || ay.equals("Nisan") || ay.equals("nisan")){
            if (gun <=20 && 1 <= gun){
                burc = "Koç";
            }else if(gun <= 30){
                burc = "Boğa";
            }else{
                isError = true;
            }
        }else if(ay.equals("MAYİS") ||ay.equals("MAYIS") || ay.equals("Mayıs") || ay.equals("mayıs") || ay.equals("Mayis") || ay.equals("mayis")){
            if (gun <=21 && 1 <= gun){
                burc = "Boğa";
            }else if(gun <= 31){
                burc = "İkizler";
            }else{
                isError = true;
            }
        }else if(ay.equals("HAZİRAN") || ay.equals("Haziran") || ay.equals("haziran")){
            if (gun <=22 && 1 <= gun){
                burc = "İkizler";
            }else if(gun <= 30){
                burc = "Yengeç";
            }else{
                isError = true;
            }
        }else if(ay.equals("TEMMUZ") || ay.equals("Temmuz") || ay.equals("temmuz")){
            if (gun <=22 && 1 <= gun){
                burc = "Yengeç";
            }else if(gun <= 31){
                burc = "Aslan";
            }else{
                isError = true;
            }
        }else if(ay.equals("AĞUSTOS") || ay.equals("Ağustos") || ay.equals("ağustos") || ay.equals("Agustos") || ay.equals("agustos")){
            if (gun <=22 && 1 <= gun){
                burc = "Aslan";
            }else if(gun <= 31){
                burc = "Başak";
            }else{
                isError = true;
            }
        }else if(ay.equals("EYLUL") ||ay.equals("EYLÜL") || ay.equals("Eylül") || ay.equals("eylül") || ay.equals("Eylul") || ay.equals("eylul")){
            if (gun <=22 && 1 <= gun){
                burc = "Başak";
            }else if(gun <= 30){
                burc = "Terazi";
            }else{
                isError = true;
            }
        }else if(ay.equals("EKİM") || ay.equals("Ekim") || ay.equals("ekim")){
            if (gun <=22 && 1 <= gun){
                burc = "Terazi";
            }else if(gun <= 31){
                burc = "Akrep";
            }else{
                isError = true;
            }
        }else if(ay.equals("KASİM") ||ay.equals("KASIM") || ay.equals("Kasım") || ay.equals("kasım") || ay.equals("Kasim") || ay.equals("kasim")){
            if (gun <=21 && 1 <= gun){
                burc = "Akrep";
            }else if(gun <= 30){
                burc = "Yay";
            }else{
                isError = true;
            }
        }else if(ay.equals("ARALİK") ||ay.equals("ARALIK") || ay.equals("Aralık") || ay.equals("aralık") || ay.equals("Aralik") || ay.equals("aralik")){
            if (gun <=21 && 1 <= gun){
                burc = "Yay";
            }else if(gun <= 31){
                burc = "Oğlak";
            }else{
                isError = true;
            }
        }else{
            isError = true;
        }

        if(isError){
            System.out.println("Geçersiz tarih girdiniz!");
        }else {
            System.out.println("Burcunuz : " + burc);
        }


    }
}
