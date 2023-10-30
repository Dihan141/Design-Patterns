package DpProject_200042149;

public class MallardDuck extends Subject implements Quackable{
    @Override
    public String description() {
        return "Mallard duck";
    }

    @Override
    public String quack() {
        notifyObservers();
        return "Mallard duck quack...";
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
