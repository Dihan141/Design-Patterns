package DpProject_200042149;

public class CountingDuckFactory implements DuckFactory{
    @Override
    public Quackable createDuck(String type) {
        if(type.equalsIgnoreCase("Counting Mallard Duck"))
            return new DuckDecorator(new MallardDuck());
        else if(type.equalsIgnoreCase("Counting Red head Duck"))
            return new DuckDecorator(new RedHeadDuck());
        else if(type.equalsIgnoreCase("Counting Goose"))
            return new DuckDecorator(new GooseAdapter(new Goose()));
        else
            return null;
    }
}
