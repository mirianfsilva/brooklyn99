import static org.junit.Assert.*;

import org.junit.Test;

public class VeiculoTest{

	@Test
	public void testNovaLocalizacao(){
		//Eu tenho
		int capacidade = 5;
		String especialidade = 'Transporte de prisioneiros';
		String localizacao = 'Delegacia Brooklyn 99'
		boolean disponibilidade = true;
		float combustivel = 88.6;
		Veiculo veiculo = new Acidente(capacidade, especialidade, localizacao, disponibilidade, combustivel);
		int nova_localizacao = 'Rua Castelo 256';

		//Eu faço
		veiculo.localizacao = nova_localizacao;

		//Eu espero
		assertEquals("Localizacao atualizada com sucesso", veiculo.localizacao, nova_localizacao);
	}

	@Test
	public void testEnviaVeiculo(){
		//Eu tenho
		int capacidade = 5;
		String especialidade = 'Transporte de prisioneiros';
		String localizacao = 'Delegacia Brooklyn 99'
		boolean disponibilidade = true;
		float combustivel = 88.6;
		Veiculo veiculo = new Acidente(capacidade, especialidade, localizacao, disponibilidade, combustivel);
		
		//Eu faço
		veiculo.enviaVeiculo();

		//Eu espero
		assertFalse("Veiculo enviado", veiculo.disponibilidade);
	}

	@Test
	public void testCombustivel(){
		//Eu tenho
		int capacidade = 5;
		String especialidade = 'Transporte de prisioneiros';
		String localizacao = 'Delegacia Brooklyn 99'
		boolean disponibilidade = true;
		float combustivel = 88.6;
		Veiculo veiculo = new Acidente(capacidade, especialidade, localizacao, disponibilidade, combustivel);
		
		//Eu faço
		veiculo.combustivel = veiculo.combustivel - 20.4;

		//Eu espero
		assertEquals("Combustivel reduzido", veiculo.combustivel, 68.2);
	}
}
