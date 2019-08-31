public abstract class Veiculo {
    public int capacidadeLugares;
    public String especialidade;
    public String localizacao;
    public boolean disponibilidade;
    private float combustivel;

    public Veiculo(int capacidadeLugares, String especialidade, String localizacao, boolean disponibilidade, float combustivel){
      this.capacidadeLugares = capacidadeLugares;
      this.especialidade = especialidade;
      this.localizacao = localizacao;
      this.disponibilidade = disponibilidade;
      this.combustivel = combustivel;
    }

    public void enviaVeiculo() {
        this.disponibilidade = false;
    }
}
