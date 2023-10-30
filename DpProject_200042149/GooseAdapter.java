package DpProject_200042149;

public class GooseAdapter extends Subject implements Quackable{
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public String description() {
        return goose.description();
    }

    @Override
    public String quack() {
        notifyObservers();
        return goose.honk();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
