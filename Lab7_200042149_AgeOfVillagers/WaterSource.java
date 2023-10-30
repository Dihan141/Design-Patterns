package Lab7_200042149_AgeOfVillagers;

public class WaterSource implements GameObject{
    String type;

    public WaterSource(String type){
        this.type = type;
    }

    @Override
    public void Create() {
        System.out.println("Creating " + type + " water source...");
    }
}
