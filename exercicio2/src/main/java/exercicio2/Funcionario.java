package exercicio2;

public class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;
    protected String dataAdmissao;

    public Funcionario(String nome, String matricula, double salarioBase, String dataAdmissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;

    }
    public double calcularSalario() {
        return salarioBase;
    }
    public double calcularDesconto() {
        return salarioBase - (salarioBase * 0.08);
    }
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", Novo Salario= '" + this.calcularSalario() + "'/" +
                ", Salario com desconto= '" + this.calcularDesconto() + "'" +
                '}';
    }
}
