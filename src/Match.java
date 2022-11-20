import javax.xml.stream.FactoryConfigurationError;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1 ,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void run(){

        if (isCheck()){
            while (this.f1.healty >0 && this.f2.healty>0){
                System.out.println("---------Raund---------");
                this.f2.healty= this.f1.hit(this.f2);
                System.out.println(this.f2.healty);
                if (isWin()){
                    break;
                }
                this.f1.healty = this.f2.hit(this.f1);
                System.out.println(this.f1.healty);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name+" Saglik --> "+this.f1.healty);
                System.out.println(this.f2.name+" Saglik --> "+this.f2.healty);
            }
        }
        else {
            System.out.println("Sporcularin Sikletleri uyusmuyor . ");
        }

    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight <=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);

    }
    boolean isWin(){
        if(this.f1.healty == 0){
            System.out.println(this.f2.name + " Kazandi");
            return true;
        }
        if (this.f2.healty== 0){
            System.out.println(this.f1.name + " Kazandi");
            return true;
        }
        else {
            return false;
        }

    }
}
