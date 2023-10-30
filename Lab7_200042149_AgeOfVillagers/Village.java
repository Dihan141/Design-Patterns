package Lab7_200042149_AgeOfVillagers;

import java.util.ArrayList;
import java.util.List;

public class Village implements GameObject {
    private final List<GameObject> objects = new ArrayList<>();

    public void Add(GameObject gameObject){
        objects.add(gameObject);
    }

    public void Remove(GameObject gameObject){
        objects.remove(gameObject);
    }
    @Override
    public void Create() {
        for(GameObject object: objects){
            object.Create();
        }
    }
}
