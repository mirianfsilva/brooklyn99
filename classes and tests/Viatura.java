public class Viatura extends Veiculo{

    public String modelo;
    private int velocidadeMax;

    public Viatura(int capacidadeLugares, String localizacao, boolean disponibilidade,
                   float combustivel, String modelo, int velocidadeMax) {
        super(capacidadeLugares, "Viatura", localizacao, disponibilidade, combustivel);
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
    }

    public boolean estimaPerseguicao(){
        return true;//TODO;
    }

}
