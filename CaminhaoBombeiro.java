public class CaminhaoBombeiro extends Veiculo{

    public float aguaDisponivel;
    public float alcanceEscada;

    public CaminhaoBombeiro(int capacidadeLugares, String localizacao, boolean disponibilidade,
                   float combustivel, float aguaDisponivel, float alcanceEscada) {
        super(capacidadeLugares, "Caminhao Bombeiro", localizacao, disponibilidade, combustivel);
        this.aguaDisponivel = aguaDisponivel;
        this.alcanceEscada = alcanceEscada;
    }

    private void atualizaAguaDisponivel(float consumo){
        //TODO;
    }

}
