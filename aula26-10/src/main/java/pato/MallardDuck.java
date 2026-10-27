package pato;

import Flybehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Pato {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
