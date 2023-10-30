package DpProject_200042149;

public class QuackObserver implements Observer{
    String name;
    public QuackObserver(String name){
        this.name = name;
    }
    @Override
    public void update(Quackable duck) {
        System.out.println(name + " is observing");
        System.out.println(duck.description() + " is quacking");
    }
}
