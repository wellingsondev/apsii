package exercicio2;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ("Ana Costa", "F001", 2500, "01/03/2020");
        System.out.println(f1.toString());
        FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021",220, 400);
        System.out.println(f2.toString());
        Gerente g1 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500,12, 20);
        System.out.println(g1.toString());
        Estagiario e1= new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);
        System.out.println(e1.toString());
    }
}
