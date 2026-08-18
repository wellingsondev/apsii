package primeiroexemplo;

public class Principal {
    public static void main(String[] args) {

        Banco banco1 = new Banco("wellingson", "21313213", 220.0);
        Banco banco2 = new Banco();

        System.out.println("oi mundo " + banco1.getNome() + " " + banco1.getCpf() + " " + banco1.getSaldo());
        System.out.println(banco2.getSaldo());
        banco2.setSaldo(100);
        System.out.println(banco2.getSaldo());

        Banco banco3 = new Banco("paulo", "21313213", 220.0);
        System.out.println("O nome do banco: " + banco3.getNome());
        banco3.setNome("joão");
        System.out.println("O nome do banco: " + banco3.getNome());

    }
}
