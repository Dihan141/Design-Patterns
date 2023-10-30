package Lab7_200042149_AgeOfVillagers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        VillageBuilder villageBuilder1 = new VillageBuilder();

        villageBuilder1.addHouse("brick").addTree("mango").addWaterSource("swimming pool").Build().Create();

        System.out.println("\n");

        VillageBuilder villageBuilder2 = new VillageBuilder();

        villageBuilder2.addHouse("mud").addTree("banana").addWaterSource("pond").Build().Create();
    }
}
