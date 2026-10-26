package br.edu.unipe.apsii.pato;

import br.edu.unipe.apsii.Flybehavior.FlyNoWay;
import br.edu.unipe.apsii.QuackBehavior.Quack;

public class ModelDuck extends Pato{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }
}
