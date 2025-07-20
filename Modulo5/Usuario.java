import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private int idade;
    private List<Emprestimo> historicoEmprestimo;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimo = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimo.add(emprestimo);
    }
}
