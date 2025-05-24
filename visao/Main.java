package visao;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LivroVisao visao = new LivroVisao(sc);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========= MENU DE LIVROS =========");
            System.out.println("1 - Listar Livros");
            System.out.println("2 - Incluir Livro");
            System.out.println("3 - Exibir Livro");
            System.out.println("4 - Alterar Livro");
            System.out.println("5 - Excluir Livro");
            System.out.println("6 - buscar por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    visao.listar();
                    break;
                case 2:
                    try {
                        visao.incluir();
                    } catch (UnsupportedOperationException e) {
                    System.out.println("Método incluir() não implementado ainda.");
                    }
                    break;
                case 3:
                    try {
                        visao.exibir();
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Método exibir() não implementado ainda.");
                    }
                    break;
                case 4:
                    try {
                        visao.alterar();
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Método alterar() não implementado ainda.");
                    }
                    break;
                case 5:
                    try {
                        visao.excluir();
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Método excluir() não implementado ainda.");
                    }
                    break;
                case 6:
                    visao.pesquisarPorNome();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
