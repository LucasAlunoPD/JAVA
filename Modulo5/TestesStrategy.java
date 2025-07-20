public class TestesStrategy {
    public static void main(String[] args) {
        Autor autorLivro = new Autor("Lucas", 30);
        autorLivro.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autorLivro.publicar(); // Deve imprimir: Publicando um livro...

        Autor autorArtigo = new Autor("Fernanda", 25);
        autorArtigo.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autorArtigo.publicar(); // Deve imprimir: Publicando um artigo...
    }
}