import dominio.Livro;
import repositorio.LivroRepositorio;

public class App {
    public static void main(String[] args) {
        LivroRepositorio repo = new LivroRepositorio();

        System.out.println("=== Livros cadastrados ===");
        for (Livro l : repo.read()) {
            System.out.println("Código: " + l.getCodigo() + " | Título: " + l.getNome());
        }

        // Lendo livro pelo código
        Livro lido = repo.read(2);
        System.out.println("\n=== Livro lido ===");
        if (lido != null) {
            System.out.println("Código: " + lido.getCodigo() + " | Título: " + lido.getNome());
        }

        // Atualizando livro
        if (lido != null) {
            lido.setAutor("Autor Atualizado");
            repo.update(lido);

            System.out.println("\n=== Após atualização ===");
            Livro atualizado = repo.read(2);
            if (atualizado != null) {
                System.out.println("Código: " + atualizado.getCodigo() + " | Autor: " + atualizado.getAutor());
            }
        }

        // Deletando livro
        repo.delete(2);

        System.out.println("\n=== Lista final ===");
        for (Livro l : repo.read()) {
            System.out.println("Código: " + l.getCodigo() + " | Título: " + l.getNome());
        }
    }
}
