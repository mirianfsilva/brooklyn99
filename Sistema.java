import javax.lang.model.util.ElementScanner6;

public class Sistema {
    public void notificaPolicial(){
      //TODO;
    }

    public void selecionaVeiculo(){
      //TODO;
    }

    private void atualizaDisponiveis(){
      //TODO;
    }

    private boolean enviaAjuda(Policial policial, Veiculo veiculo){
      return true;
    }

    private boolean socorroFeito(){
      if (enviaAjuda(policial, veiculo))
      {
        return true;
      }
      else
        return false; 
    }

}
