public class Fighter {
    String name;
    int damege;
    int healty;
    int weight;


    Fighter(String name,int damege,int healty,int weight){
        this.name=name;
        this.damege=damege;
        this.healty=healty;
        this.weight=weight;


    }
    int hit(Fighter foe){

        System.out.println(this.name+ " >= "+foe.name+" "+this.damege+" Hasar Vurdu");
        if (foe.healty - this.damege < 0){
            return 0;
        }
        return foe.healty - foe.damege;
    }



}
