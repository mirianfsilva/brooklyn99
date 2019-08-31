public class Acidente {
    public int gravidade;
    public String localizacao;
    public boolean estadoAtendimento;

    public Acidente(int gravidade, String localizacao) {
      this.gravidade = gravidade;
      this.localizacao = localizacao;
      this.estadoAtendimento = false;
    }

    public void solicitaAtendimento(){
      //TODO;
    }

    private void atualizaGravidade(int gravidade){
      this.gravidade = gravidade;
    }

    private void atendeAcidente(){
      this.estadoAtendimento = true;
    }
}
