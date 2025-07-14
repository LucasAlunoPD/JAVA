
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lucas Menezes", "Brasileiro", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Título: " + artigo.getTitulo());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}
