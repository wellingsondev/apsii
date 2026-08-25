package exercicio2;

public class Gerente extends FuncionarioCLT{
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,  double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;

    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (super.calcularSalario() * (percentualBonus / 100));
    }
    @Override
    public double calcularDesconto() {
        if (this.tamanhoEquipe > 10) {
            return super.calcularDesconto() - 100;
        }
        return super.calcularDesconto() ;
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", valeTransporte=" + valeTransporte +
                ", valeAlimentacao=" + valeAlimentacao +
                ", tamanhoEquipe=" + tamanhoEquipe +
                ", percentualBonus=" + percentualBonus +
                ", Novo Salario= '" + this.calcularSalario() + "'/" +
                ", Salario com desconto= '" + this.calcularDesconto() + "'" +
                '}';
    }

}
