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
	Equipe eq=new Equipe();
	
	//Un test qui permet de verifier si une session existe dans l'objet club.
	@Test
	public void testIsSession() {
		
		club.CreerSession();
		assertNull("Aucune session n'a été pas créée", club.getSession());
		
	}
	//Un test qui permet de verifier si une equipe existe dans l'objet club.
	@Test
	public void TestEquipeExiste() {
		club.creerEquipe();
		assertNull("Aucune Equipe n'a été pas créée", club.getEquipe());
		
	}
	
	//Un test qui permet de verifier s'il ya des joueurs dans l'objet Equipe d'un club.
	@Test
	public void testJoueurExisteDansEquipe() {
		club.creerEquipe();
		assertNull("Aucun joueur n'a été pas enregistré", club.getEquipe().get(0).getJoueur());
		assertNull("Aucune joueur n'a été pas enregistré", club.getEquipe().get(1).getJoueur());
	}

	/*
	
	@Test
	public void testIsManche(Manche manche) {
		assertEquals("Aucune manche n'a été pas créée", null, manche);	
	}
	
	@Test
	public void testEquipeExiste(Equipe equipe) {
		assertEquals("Aucune equipe n'a pas été créée", null, equipe);	
	}*/
	

}
