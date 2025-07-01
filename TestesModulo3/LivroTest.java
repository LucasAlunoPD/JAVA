import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    Autor autor = new Autor("Jess", "Brasileira");
    Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
    Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

    @Test
    public void testLivroDisponivel() {
        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testTituloELivro() {
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testGenero() {
        assertEquals("tecnologia", livro1.getGenero());
    }
}