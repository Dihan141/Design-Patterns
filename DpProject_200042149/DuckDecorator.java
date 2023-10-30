package DpProject_200042149;

public class DuckDecorator implements Quackable{
    Quackable duck;
    private int numberOfQuacks;

    public DuckDecorator(Quackable duck){
        numberOfQuacks = 0;
        this.duck = duck;
    }

    @Override
    public String description() {
        return "Counting " + duck.description();
    }

    @Override
    public String quack() {
        numberOfQuacks++;
        return duck.quack();
    }

    public void getTotalQuack(){
        System.out.println(duck.description() + " quacked " + numberOfQuacks + " times");
    }
}
