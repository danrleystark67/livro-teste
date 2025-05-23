package fakedb;
import dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro>{

    @Override
    protected void preencherDados() {
        this.instancia.add(new Livro(1, "O senhor das armas", "Bibi Santos", 2021));
        this.instancia.add(new Livro(2, "O senhor dos aneis", "JRR", 1954));
        this.instancia.add(new Livro(3, "O senhor dos aneis as duas torres", "JJR", 1954));
        this.instancia.add(new Livro(4, "O senhor dos aneis o retorno do rei", "JJR", 1955));
        this.instancia.add(new Livro(5, "Harry Potter e a pedra filosofal", "JKRowling", 1997));
        this.instancia.add(new Livro(6, "Harry Potter e o prisioneiro de azkaban", "JKRowling", 1999));
        this.instancia.add(new Livro(7, "Harry Potter e a camara secreta", "JKRowling", 1998));
        this.instancia.add(new Livro(8, "Harry Potter e o calix de fogo", "JKRowling", 2000));
        this.instancia.add(new Livro(9, "Harry Potter e a ordem da fenix", "JKRowling", 2003));
        this.instancia.add(new Livro(10, "Harry Potter e o enigma do principe", "JKRowling", 2005));
        this.instancia.add(new Livro(11, "Harry Potter e as reliquias da morte", "JKRowling", 2007));
        
    }
    public LivroFakeDB(){
        super();
    }
    
}
