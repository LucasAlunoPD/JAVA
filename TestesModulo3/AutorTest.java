import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Clarice", "Brasileira");
        assertEquals("Clarice", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }
}