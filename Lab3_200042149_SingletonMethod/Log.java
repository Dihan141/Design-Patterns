package Lab3_200042149_SingletonMethod;

import java.util.ArrayList;

public class Log {
    ArrayList<String> arrayList = new ArrayList<>();

    private static Log log;
    private Log(){

    }

    public static Log getInstance(){
        if(log == null){
            log = new Log();
        }
        return log;
    }

    public void ShowLog(){
        for (String i: arrayList) {
            System.out.println(i);
        }
    }
}
