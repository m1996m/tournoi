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
		
		assertEquals("Aucune session n'a �t� pas cr��e", null, club.getSession());
		
	}
	@Test
	public void TestEquipeExiste() {
		assertEquals("Aucune Equipe n'a �t� pas cr��e", null, club.getEquipe());
		
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
