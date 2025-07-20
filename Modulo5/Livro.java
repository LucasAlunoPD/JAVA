public class Livro {
    private String titulo;
    private String genero;
    private Autor autor;
    private String faixaEtaria;
    private boolean disponivel;

    public Livro(String titulo, String genero, Autor autor, String faixaEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.faixaEtaria = faixaEtaria;
        this.disponivel = true;
        autor.adicionarObra(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void marcarComoDisponivel() {
        disponivel = true;
    }

    public void marcarComoIndisponivel() {
        disponivel = false;
    }
}
