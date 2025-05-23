package dominio;



public class Livro {

    private int codigo;
    private String nome;
    private String autor;
    private int dataDeLancamento;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getDataDeLancamento() {
        return dataDeLancamento;
    }
    public void setDataDeLancamento(int dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
    public Livro() {
    }
    public Livro(int codigo, String nome, String autor, int dataDeLancamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.dataDeLancamento = dataDeLancamento;
    }
   
    
}