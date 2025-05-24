package visao;

import java.util.ArrayList;
import java.util.Scanner;
import dominio.Livro;
import servico.LivroServico;

public class LivroVisao extends BaseVisao{

    private LivroServico serv;

    public LivroVisao(Scanner sc){
        super(sc);
        this.serv = new LivroServico();
    }


    public void pesquisarPorNome() {
    System.out.println("\n========= PESQUISAR LIVRO POR NOME =========");
    System.out.print("Digite o nome (ou parte do nome) do livro: ");
    String nome = sc.nextLine();

    ArrayList<Livro> encontrados =  serv.buscarPorNome(nome);

    if (encontrados.isEmpty()) {
        System.out.println("Nenhum livro encontrado com esse nome.");
    } else {
        System.out.println("Livros encontrados:");
        for (Livro l : encontrados) {
            System.out.println("Código: " + l.getCodigo() + ", Nome: " + l.getNome() + ", Autor: " + l.getAutor());
        }
    }
}

//---------------//-------------//----Listar----------//------------//-------------------//-----------//
    @Override
    public void listar() {
        System.out.println("***************************************************");
        System.out.println("** COLABORADOR - LISTAR ***************************");
        ArrayList<Livro> lista = this.serv.navegar();
        for (Livro ps : lista) {
            System.out.println("Codigo: " + ps.getCodigo());
            System.out.println("Nome: " + ps.getNome());
            System.out.println("Autor: " + ps.getAutor());
            System.out.println("Data de lançamento " + ps.getDataDeLancamento());
        }
        System.out.println("***************************************************");
    }


    //----------//--------------exibir------------------------------//----------------------------//
    @Override

    protected void exibir() {
    System.out.println("\n========= EXIBIR LIVRO =========");

    System.out.print("Digite o código do livro: ");
    int codigo = 0;
    try {
        codigo = Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Código inválido. Operação cancelada.");
        return;
    }

    Livro livro = serv.ler(codigo);

    if (livro == null) {
        System.out.println("Livro não encontrado.");
    } else {
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Data de Lançamento: " + livro.getDataDeLancamento());
    }
}


//--------------------------//---------Incluir---------//----------------------//--------------//

@Override
protected void incluir() {
    System.out.println("\n========= INCLUIR NOVO LIVRO =========");

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Autor: ");
    String autor = sc.nextLine();

    int ano;
    while (true) {
        System.out.print("Ano de lançamento: ");
        try {
            ano = Integer.parseInt(sc.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido para o ano.");
        }
    }

    // Criação do novo objeto Livro
    Livro novoLivro = new Livro(0, nome, autor, ano);

    // Adiciona o livro usando o serviço
    Livro adicionado = serv.adicionar(novoLivro);

    System.out.println("Livro adicionado com sucesso! Código gerado: " + adicionado.getCodigo());
}



//-------------------//---------Alterar---------------//-----------------//-----------------//

    @Override
    protected void alterar() {
    System.out.println("\n========= ALTERAR LIVRO =========");
    System.out.print("Digite o código do livro que deseja alterar: ");

    int codigo;
    try {
        codigo = Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Código inválido!");
        return;
    }

    Livro livroExistente = serv.ler(codigo);

    if (livroExistente == null) {
        System.out.println("Livro não encontrado!");
        return;
    }

    System.out.println("Livro atual:");
    System.out.println("Nome: " + livroExistente.getNome());
    System.out.println("Autor: " + livroExistente.getAutor());
    System.out.println("Ano de lançamento: " + livroExistente.getDataDeLancamento());

    System.out.print("Novo nome (deixe em branco para manter): ");
    String novoNome = sc.nextLine();
    if (!novoNome.isEmpty()) {
        livroExistente.setNome(novoNome);
    }

    System.out.print("Novo autor (deixe em branco para manter): ");
    String novoAutor = sc.nextLine();
    if (!novoAutor.isEmpty()) {
        livroExistente.setAutor(novoAutor);
    }

    System.out.print("Novo ano de lançamento (deixe em branco para manter): ");
    String novaDataStr = sc.nextLine();
    if (!novaDataStr.isEmpty()) {
        try {
            int novaData = Integer.parseInt(novaDataStr);
            livroExistente.setDataDeLancamento(novaData);
        } catch (NumberFormatException e) {
            System.out.println("Ano inválido! Mantendo o ano anterior.");
        }
    }

    serv.editar(livroExistente);
    System.out.println("Livro atualizado com sucesso!");
}


//-------//----------//---------//----Excluir--------//----------//--------------//-----------//
    @Override
    protected void excluir() {
    System.out.println("\n========= EXCLUIR LIVRO =========");

    System.out.print("Digite o código do livro: ");
    int codigo;
    try {
        codigo = Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException e) {
        System.out.println("Código inválido.");
        return;
    }

    Livro removido = serv.deletar(codigo);
    if (removido != null) {
        System.out.println("codigo: "+ removido.getCodigo());
        System.out.println("livro: "+ removido.getNome());
        System.out.println("Livro removido com sucesso!");
    } else {
        System.out.println("Livro com esse código não foi encontrado.");
    }
}



//--------------//--------------//-------Carregar--------//------------//-------------//---------//
    @Override
    public void carregar() {
    System.out.println("\n========= CARREGANDO LIVROS PADRÃO =========");

    Livro l1 = new Livro(0, "Dom Casmurro", "Machado de Assis", 1899);
    Livro l2 = new Livro(0, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
    Livro l3 = new Livro(0, "1984", "George Orwell", 1949);

    serv.adicionar(l1);
    serv.adicionar(l2);
    serv.adicionar(l3);

    System.out.println("Livros padrão carregados com sucesso!");
}
    
}