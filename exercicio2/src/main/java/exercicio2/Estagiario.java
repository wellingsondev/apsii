package exercicio2;

public class Estagiario extends Funcionario {
    private double valorBolsaAuxilio;
    private double cargaHorariaSemanal;

    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, double valorBolsaAuxilio, double cargaHorariaSemanal) {

        super(nome, matricula, salarioBase, dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public double calcularSalario() {
        this.salarioBase += this.valorBolsaAuxilio;
        return this.valorBolsaAuxilio;
    }
    @Override
    public double calcularDesconto() {
        return 0;
    }
    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", valorBolsaAuxilio=" + valorBolsaAuxilio +
                ", cargaHorariaSemanal=" + cargaHorariaSemanal +
                ", Novo Salario= '" + this.calcularSalario() + "'/" +
                ", Salario com desconto= '" + this.calcularDesconto() + "'" +
                '}';
    }
}