package Lab7_200042149_AgeOfVillagers;

public class House implements GameObject{
    String type;

    public House(String type){
        this.type = type;
    }

    @Override
    public void Create() {
        System.out.println("Creating " + type + " house...");
    }
}
