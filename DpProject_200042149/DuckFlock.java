package DpProject_200042149;

import java.util.ArrayList;

public class DuckFlock implements Quackable{
    private final ArrayList<Quackable> ducks = new ArrayList<>();

    public void Add(Quackable duck){
        ducks.add(duck);
    }

    @Override
    public String description() {
        return "Duck flock";
    }

    @Override
    public String quack() {
        String res = "";
        for(Quackable duck: ducks){
            res += duck.quack();
            res += "\n";
        }
        return res;
    }
}
