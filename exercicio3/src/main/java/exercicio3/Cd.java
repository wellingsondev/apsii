package exercicio3;

public class Cd extends Produto implements InfoGerais {
    private int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }
    public void setnumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public String exibeInformacoes() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nNúmero de Faixas: " + getNumFaixas();
    }
}
