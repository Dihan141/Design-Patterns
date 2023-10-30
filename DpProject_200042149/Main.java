package DpProject_200042149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DuckFactory normalDuckFactory = new NormalDuckFactory();
        DuckFactory countingDuckFactory = new CountingDuckFactory();

        //Creating normal ducks
        Quackable mallardDuck = normalDuckFactory.createDuck("mallard duck");
        Quackable redheadDuck = normalDuckFactory.createDuck("red head duck");
        Quackable goose = normalDuckFactory.createDuck("goose");

        //normal quacking
        System.out.println(mallardDuck.quack());
        System.out.println(redheadDuck.quack());
        System.out.println(goose.quack());

        System.out.println("\n");

        //Creating counting ducks
        Quackable countingmallardDuck = countingDuckFactory.createDuck("counting mallard duck");
        Quackable countingredheadDuck = countingDuckFactory.createDuck("counting red head duck");
        Quackable countingGoose = countingDuckFactory.createDuck("counting goose");

        //quack counting
        System.out.println(countingmallardDuck.quack());
        System.out.println(countingmallardDuck.quack());
        System.out.println(countingredheadDuck.quack());
        System.out.println(countingGoose.quack());
        System.out.println(countingGoose.quack());

        ((DuckDecorator) countingmallardDuck).getTotalQuack();
        ((DuckDecorator) countingredheadDuck).getTotalQuack();
        ((DuckDecorator) countingGoose).getTotalQuack();

        System.out.println("\n");

        //Creating flocks
        DuckFlock duckFlock = new DuckFlock();
        duckFlock.Add(mallardDuck);
        duckFlock.Add(redheadDuck);
        duckFlock.Add(goose);

        DuckFlock duckFlock1 = new DuckFlock();
        duckFlock1.Add(countingmallardDuck);
        duckFlock1.Add(countingGoose);
        duckFlock1.Add(countingredheadDuck);

        duckFlock.Add(duckFlock1);

        System.out.println(duckFlock.quack());

        System.out.println("\n");

        //Creating observers
        Observer observer1 = new QuackObserver("Akash");
        Observer observer2 = new QuackObserver("Anan");

        ((Subject) mallardDuck).addObserver(observer1);
        ((Subject) redheadDuck).addObserver(observer1);
        mallardDuck.quack();
        redheadDuck.quack();

        ((Subject) mallardDuck).addObserver(observer2);
        ((Subject) goose).addObserver(observer2);
        mallardDuck.quack();
        goose.quack();
    }
}
