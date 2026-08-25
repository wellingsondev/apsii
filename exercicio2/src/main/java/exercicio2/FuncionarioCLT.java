package exercicio2;

public class FuncionarioCLT extends Funcionario {
    protected double valeTransporte;
    protected double valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao,  double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.valeTransporte + this.valeAlimentacao;
    }
    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() - 50;
    }
    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", valeTransporte=" + valeTransporte +
                ", valeAlimentacao=" + valeAlimentacao +
                ", Novo Salario= '" + this.calcularSalario() + '/' +
                ", Salario com desconto= '" + this.calcularDesconto() + "'" +
                '}';
    }
    public double getValeTransporte() {
        return valeTransporte;
    }
    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
    public double getValeAlimentacao() {
        return valeAlimentacao;

    }
    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }


}
