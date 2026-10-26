package br.edu.unipe.apsii.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
