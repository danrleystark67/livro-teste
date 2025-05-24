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
        this.instancia.add(new Livro(12, "Harry Potter e a Criança Amaldiçoada", "J.K. Rowling", 2016));
        this.instancia.add(new Livro(13, "Percy Jackson e a Batalha do Labirinto", "Rick Riordan", 2008));
        this.instancia.add(new Livro(14, "Percy Jackson e o Ladrão de Raios", "Rick Riordan", 2005));
        this.instancia.add(new Livro(15, "Percy Jackson e o Mar de Monstros", "Rick Riordan", 2006));
        this.instancia.add(new Livro(16, "O Hobbit", "J.R.R. Tolkien", 1937));
        this.instancia.add(new Livro(20, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        this.instancia.add(new Livro(21, "Percy Jackson e a Maldição do Titã", "Rick Riordan", 2007));
        this.instancia.add(new Livro(22, "Percy Jackson e o Último Olimpiano", "Rick Riordan", 2009));
        this.instancia.add(new Livro(23, "Percy Jackson e o Cálice dos Deuses", "Rick Riordan", 2014));
        this.instancia.add(new Livro(24, "Percy Jackson e a Ira da Deusa Tríplice", "Rick Riordan", 2023));
    }
    public LivroFakeDB(){
        super();
    }
    
}
