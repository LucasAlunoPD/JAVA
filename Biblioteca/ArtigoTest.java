
import org.junit.Test;
import static org.junit.Assert.*;

public class ArtigoTest {
    @Test
    public void testArtigoCreation() {
        Autor autor = new Autor("José", "Português", false);
        Artigo artigo = new Artigo("Java Básico", autor, "programação", true);

        assertEquals("Java Básico", artigo.getTitulo());
        assertEquals("José", artigo.getAutor().getNome());
        assertTrue(artigo.isPublicado());
    }
}
