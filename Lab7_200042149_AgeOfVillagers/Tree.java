package Lab7_200042149_AgeOfVillagers;

public class Tree implements GameObject{
    String type;

    public Tree(String type){
        this.type = type;
    }

    @Override
    public void Create() {
        System.out.println("Creating " + type + " tree...");
    }
}
