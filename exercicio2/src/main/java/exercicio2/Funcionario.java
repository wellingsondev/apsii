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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;

    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
