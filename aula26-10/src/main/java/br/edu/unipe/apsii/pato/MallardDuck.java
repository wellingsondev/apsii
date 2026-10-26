package br.edu.unipe.apsii.pato;

import br.edu.unipe.apsii.Flybehavior.FlyWithWings;
import br.edu.unipe.apsii.QuackBehavior.Quack;

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
