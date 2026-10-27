package pato;
import Flybehavior.Flybehavior;
import QuackBehavior.QuackBehavior;


public abstract class Pato {
    Flybehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Pato(){

    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys! ");
    }
    public void setFlyBehavior (Flybehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior (QuackBehavior qb) {
        quackBehavior = qb;
    }

}
