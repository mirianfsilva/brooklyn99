import static org.junit.Assert.*;

import org.junit.Test;

public class AcidenteTest{

	@Test
	public void testAtualizaGravidade(){
		//Eu tenho
		int gravidade = 5;
		String localizacao = 'Rua Castelo 262';
		Acidente acidente = new Acidente(gravidade, localizacao);
		int nova_gravidade = 8;

		//Eu faço
		acidente.atualizaGravidade(nova_gravidade);

		//Eu espero
		assertEquals("Gravidade atualizada com sucesso", acidente.gravidade, nova_gravidade);
	}

	@Test
	public void testLocalizacao(){
		//Eu tenho
		int gravidade = 5;
		String localizacao = 'Rua Castelo 262';
		
		//Eu faço
		Acidente acidente = new Acidente(gravidade, localizacao);

		//Eu espero
		assertNotNull("Endereço preenchido", acidente.localizacao);
	}

	@Test
	public void testAtendimento(){
		//Eu tenho
		int gravidade = 5;
		String localizacao = 'Rua Castelo 262';
		Acidente acidente = new Acidente(gravidade, localizacao);
		
		//Eu faço
		acidente.atendeAcidente();

		//Eu espero
		assertTrue("Acidente atendido", acidente.estadoAtendimento);
	}
}
