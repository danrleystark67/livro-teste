package servico;

import java.util.ArrayList;
import dominio.Livro;
import repositorio.LivroRepositorio;

public class LivroServico implements BaseServico<Livro> {
    private LivroRepositorio repo;

public ArrayList<Livro> buscarPorNome(String nome){
    return this.repo.buscarPorNome(nome);
}

public LivroServico(){
    this.repo = new LivroRepositorio();
}

@Override
public Livro adicionar(Livro instancia) {
   
    return this.repo.create(instancia);
}

@Override
public Livro deletar(int codigo) {
    return this.repo.delete(codigo);
}

@Override
public Livro editar(Livro instancia) {
    return this.repo.update(instancia);
}

@Override
public Livro ler(int codigo) {
    return this.repo.read(codigo);
}

@Override
public ArrayList<Livro> navegar() {
    return this.repo.read();
}

}
