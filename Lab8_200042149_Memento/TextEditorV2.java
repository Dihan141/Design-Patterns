package Lab8_200042149_Memento;

import java.util.ArrayList;

public class TextEditorV2 {
    private ArrayList<String> lines = new ArrayList<>();

    public void setLines(String string){
        lines.add(string);
    }

    public MementoV2 saveState(){
        return new MementoV2(lines);
    }

    public void restore(MementoV2 mementoV2){
        this.lines = mementoV2.getState();
    }

    public String getLines(){
        String res = "";

        for(String line: lines){
            res += line;
            res += "\n";
        }

        return res;
    }
}
