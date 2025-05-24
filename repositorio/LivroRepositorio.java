package repositorio;

import dominio.Livro;
import fakedb.LivroFakeDB;
import java.util.ArrayList;

public class LivroRepositorio extends BaseRepositorio<Livro>{
    private LivroFakeDB fakeDB;
    
public LivroRepositorio(){
    this.fakeDB = new LivroFakeDB();
    this.baseDeDados = this.fakeDB;
}

public ArrayList<Livro> buscarPorNome(String nome) {
    ArrayList<Livro> resultado = new ArrayList<>();
    for (Livro livro : this.baseDeDados.getInstancia()) {
        if (livro.getNome().toLowerCase().contains(nome.toLowerCase())) {
            resultado.add(livro);
        }
    }
    return resultado;
}

@Override
public Livro create(Livro instancia) {
   int chave = 1;
        ArrayList<Livro> lista = this.baseDeDados.getInstancia();
        if (!lista.isEmpty()) {
            Livro ultimo = lista.get(lista.size() - 1);
            chave = ultimo.getCodigo() + 1;
        }
        instancia.setCodigo(chave);
        lista.add(instancia);
        return instancia;
}

@Override
public Livro delete(int codigo) {
     Livro deletado = this.read(codigo);
        if (deletado != null) {
            this.baseDeDados.getInstancia().remove(deletado);
        }
        return deletado;
}

@Override
public Livro read(int codigo) {
     ArrayList<Livro> lista = this.baseDeDados.getInstancia();
        for (Livro livro : lista) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
}

@Override
public Livro update(Livro instancia) {
     Livro alterado = this.read((int) instancia.getCodigo());
        if (alterado != null) {
            alterado.setAutor(instancia.getAutor());
            alterado.setNome(instancia.getNome());
            alterado.setCodigo(instancia.getCodigo());
            alterado.setDataDeLancamento(instancia.getDataDeLancamento());
        }
        return alterado;
}
    
}