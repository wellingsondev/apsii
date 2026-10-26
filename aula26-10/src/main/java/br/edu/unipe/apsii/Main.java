package br.edu.unipe.apsii;

import br.edu.unipe.apsii.Flybehavior.FlyRocketPowered;
import br.edu.unipe.apsii.pato.MallardDuck;
import br.edu.unipe.apsii.pato.ModelDuck;
import br.edu.unipe.apsii.pato.Pato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Pato mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Pato model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior (new FlyRocketPowered());
        model.performFly();
    }
}
