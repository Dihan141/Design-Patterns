package Lab8_200042149_Memento;

import java.util.ArrayList;

public class MementoV2 {
    private ArrayList<String> state;

    public MementoV2(ArrayList<String> state){
        this.state = new ArrayList<>();
        this.state = state;
    }

    public ArrayList<String> getState(){
        return state;
    }
}
