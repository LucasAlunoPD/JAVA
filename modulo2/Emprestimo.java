import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataRetirada;
    private Date dataDevolucao;
    private Date previsaoDevolver;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.previsaoDevolver = dataDevolucao;
        livro.marcarComoIndisponivel();
        usuario.adicionarEmprestimo(this);
    }

    public void registrarRetirada() {
        livro.marcarComoIndisponivel();
    }

    public void registrarDevolucao() {
        livro.marcarComoDisponivel();
    }

    public boolean estaVencido() {
        Date hoje = new Date();
        return hoje.after(previsaoDevolver);
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
