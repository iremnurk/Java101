public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Ahmet", 10,90,90, 50,50);
        Fighter f2=new Fighter("Mehmet", 20,85,90, 0,50);

        Match match=new Match(f1,f2,50,120);
        match.run();

    }
}