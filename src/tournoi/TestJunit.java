/**
 * 
 */
package tournoi;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author DELL
 *
 */
public class TestJunit {
	Club club=new Club();
	
	@Test
	public void testIsSession() {
		
		club.CreerSession();
		assertNotNull("Aucune session n'a �t� pas cr��e", club.getSession());
		
	}
	@Test
	public void TestEquipeExiste() {
		club.creerEquipe();
		assertNotNull("Aucune Equipe n'a �t� pas cr��e", club.getEquipe());
		
	}

	/*
	
	@Test
	public void testIsManche(Manche manche) {
		assertEquals("Aucune manche n'a �t� pas cr��e", null, manche);	
	}
	
	@Test
	public void testEquipeExiste(Equipe equipe) {
		assertEquals("Aucune equipe n'a pas �t� cr��e", null, equipe);	
	}*/
	

}
