package exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        Cd cd = new Cd();


        System.out.println("Digite o nome do livro:");
        livro.setNome(sc.nextLine());
        System.out.println("Digite o preço do livro:");
        livro.setPreco(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite o autor do livro:");
        livro.setAutor(sc.nextLine());

        System.out.println("Digite o nome do CD:");
        cd.setNome(sc.nextLine());
        System.out.println("Digite o preço do CD:");
        cd.setPreco(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite o numero de Faixas do CD:");
        cd.setnumFaixas(sc.nextInt());

        System.out.println(cd.exibeInformacoes());


    }
}
