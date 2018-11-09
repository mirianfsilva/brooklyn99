public class Acidente {
    public int gravidade;
    public String localizacao;
    public boolean estadoAtendimento;

    public Acidente(int gravidade, String localizacao, boolean estadoAtendimento) {
      this.gravidade = gravidade;
      this.localizacao = localizacao;
      this.estadoAtendimento = estadoAtendimento;
    }

    public void solicitaAtendimento(){
      //TODO;
    }

    private void atualizaGravidade(int gravidade){
      this.gravidade = gravidade;
    }

    private void atendeAcidente(){
      //TODO;
    }
}
