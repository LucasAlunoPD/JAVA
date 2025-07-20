
import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {
    @Test
    public void testIsUsuario() {
        Autor autor = new Autor("Maria", "Brasileira", true);
        assertTrue(autor.isUsuario());

        autor.setUsuario(false);
        assertFalse(autor.isUsuario());
    }
}
