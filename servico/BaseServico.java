package servico;
import java.util.ArrayList;

public interface BaseServico<TDominio> {
    ArrayList<TDominio> navegar();
    TDominio ler(int codigo);
    TDominio editar(TDominio instancia);
    TDominio adicionar(TDominio instancia);
    TDominio deletar(int codigo);
}

