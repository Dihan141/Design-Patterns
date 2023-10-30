package DpProject_200042149;

public class RedHeadDuck extends Subject implements Quackable{
    @Override
    public String description() {
        return "Red head duck";
    }

    @Override
    public String quack() {
        notifyObservers();
        return "Red head duck quack...";
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
