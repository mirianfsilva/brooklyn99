public class Camburao extends Veiculo{

    public int capacidadePresos;

    public Camburao(int capacidadeLugares, String localizacao, boolean disponibilidade,
                   float combustivel, int capacidadePresos) {
        super(capacidadeLugares, "Camburao", localizacao, disponibilidade, combustivel);
        this.capacidadePresos = capacidadePresos;
    }

    private void atualizaCapacidadePresos(int novosPresos){
        //TODO;
    }

}
