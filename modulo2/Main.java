import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("As cronicas de gelo e fogo", "Tecnologia", autor, "Livre");

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date agora = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, agora, agora);

        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
