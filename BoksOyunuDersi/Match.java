public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()) {
            while  (this.f1.health>0 && this.f2.health>0){
                if (this.f1.isStart() && this.f2.isStart()){
                    System.out.println("=====>>> YENİ ROUND <<<====");
                    if (this.f1.isStart()){
                        f2.health=f1.hit(f2);
                        if (isWin()){
                            break;
                        }
                    }else{
                        f1.health=f2.hit(f1);
                        if (isWin()){
                            break;
                        }
                    }

                }

            }

        }else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");

        }
    }

    public boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println(f2.name + " kazandı.");
            return true;
        }else if(this.f2.health==0){
            System.out.println(f1.name + " kazandı.");
            return true;
        }
        return false;
    }

}