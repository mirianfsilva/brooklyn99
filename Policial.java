public class Policial {
    public String patente;
    public String nome;
    private String endereco;
    public boolean administrador;

    public Policial(String patente, String nome, String endereco, boolean administrador) {
      this.patente = patente;
      this.nome = nome;
      this.endereco = endereco;
      this.administrador = administrador;
    }

    public void emiteNotificacao(Policial Admin, String mensagem){
      System.out.println(mensagem);
    }

    public void preencheDados(){
      //TODO;
    }

    public void confirmaAtendimento(){
      //TODO;
    }
}
