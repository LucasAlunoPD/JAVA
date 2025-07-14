
public class Autor extends Pessoa {
    private boolean isUsuario;

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome, nacionalidade);
        this.isUsuario = isUsuario;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean usuario) {
        isUsuario = usuario;
    }
}
