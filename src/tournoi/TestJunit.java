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

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testIsSession(Session session) {
		
		assertEquals("Aucune session n'a �t� pas cr��e", null, session);
		
	}
	
	@Test
	public void testIsManche(Manche manche) {
		assertEquals("Aucune manche n'a �t� pas cr��e", null, manche);	
	}
	
	@Test
	public void testEquipeExiste(Equipe equipe) {
		assertEquals("Aucune equipe n'a pas �t� cr��e", null, equipe);	
	}
	

}
