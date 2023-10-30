package Lab7_200042149_AgeOfVillagers;

public class VillageBuilder {
    private final Village village = new Village();

    public VillageBuilder addHouse(String type){
        village.Add(new House(type));
        return this;
    }

    public VillageBuilder addTree(String type){
        village.Add(new Tree(type));
        return this;
    }

    public VillageBuilder addWaterSource(String type){
        village.Add(new WaterSource(type));
        return this;
    }

    public Village Build(){
        return village;
    }
}
