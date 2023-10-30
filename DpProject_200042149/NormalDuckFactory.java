package DpProject_200042149;

public class NormalDuckFactory implements DuckFactory{
    @Override
    public Quackable createDuck(String type) {
        if(type.equalsIgnoreCase("Mallard Duck"))
            return new MallardDuck();
        else if(type.equalsIgnoreCase("Red head Duck"))
            return new RedHeadDuck();
        else if(type.equalsIgnoreCase("Goose"))
            return new GooseAdapter(new Goose());
        else
            return null;
    }
}
