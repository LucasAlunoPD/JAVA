public class Autor extends Usuario implements PublicavelInterface {
    private EstrategiaPublicacao estrategiaPublicacao;

    public Autor(String nome, int idade) {
        super(nome, idade);
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}