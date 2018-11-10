import static org.junit.Assert.*;

import org.junit.Test;

public class PolicialTest{

	@Test
	public void testPatente(){
		//Eu tenho
		String patente = 'Detetive';
		String nome = 'Jake Peralta';
		String endereco = 'Rua Progresso 23';

		//Eu faço
		Policial policial = new Policia(patente, nome, endereco);

		//Eu espero
		assertNotNull("Patente existente", policial.patente);
	}

	@Test
	public void testEndereco(){
		//Eu tenho
		String patente = 'Detetive';
		String nome = 'Jake Peralta';
		String endereco = 'Rua Progresso 23';

		//Eu faço
		Policial policial = new Policia(patente, nome, endereco);

		//Eu espero
		assertEquals("Endereco Correto", policial.endereco, endereco);
	}

	@Test
	public void testAtendimento(){
		//Eu tenho
		String patente = 'Detetive';
		String nome = 'Jake Peralta';
		String endereco = 'Rua Progresso 23';

		//Eu faço
		Policial policial = new Policia(patente, nome, endereco);

		//Eu espero
		assertEquals("Endereco Correto", policial.nome == nome);
	}
}
