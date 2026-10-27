package br.edu.unipe.apsii;

import Flybehavior.FlyRocketPowered;
import pato.MallardDuck;
import pato.ModelDuck;
import pato.Pato;

public class Main {
    public static void main(String[] args) {

                Pato mallard = new MallardDuck();
                mallard.performQuack();
                mallard.performFly();

                Pato model = new ModelDuck();
                model.performFly();
                model.setFlyBehavior (new FlyRocketPowered());
                model.performFly();
            }
        }


