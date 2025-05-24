package visao;

import java.util.Scanner;

public class LivroMenu extends BaseMenu {

    private LivroVisao visao;

    private Scanner scan;

    public LivroMenu(Scanner sc){
        super(sc);
        this.visao = new LivroVisao(sc);
    }

    @Override
    public int executar() {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("1 - Listar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Incluir");
            System.out.println("4 - Alterar");
            System.out.println("5 - Excluir");
            System.out.println("9 - Sair");
            opcao = this.scan.nextInt();
            switch (opcao) {
                case 1:
                    this.visao.listar();
                    break;
                case 2:
                    this.visao.exibir();
                    break;
                case 3:
                    this.visao.incluir();
                    break;
                case 4:
                    this.visao.alterar();
                    break;
                case 5:
                    this.visao.excluir();
                    break;
                case 9:
                    return opcao;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        return opcao;
    }
}