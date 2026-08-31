package exemplo03;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        System.out.println(veiculo.acelerar());

        Veiculo carro = new Carro();
        System.out.println(carro.acelerar());

        Veiculo bicicleta = new Bicicleta();
        System.out.println(bicicleta.acelerar());

        Pista pista = new Pista();
        System.out.println(pista.iniciarCorrida(carro));
    }
}
