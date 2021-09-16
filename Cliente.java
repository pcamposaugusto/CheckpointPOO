package POO.TrabalhoFinal;

public class Cliente {

    private int id;
    private String nome;
    private String email;
    private boolean cadastro;

    public Cliente(int id, String nome, String email, boolean cadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cadastro = cadastro;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isCadastroAtivo() {
        return cadastro;
    }

    public void setCadastro(boolean situacao) {
        this.cadastro = situacao;
        String resposta;
        if (this.cadastro){
            resposta="ativo";
        } else {
            resposta="cancelado";
        }
        System.out.println("O cliente "+this.nome+" esta com o seu cadastro "+resposta+".");
    }
}