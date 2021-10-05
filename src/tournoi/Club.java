package tournoi;
import java.util.ArrayList;
import java.util.*;

/**
 * @author DELL
 * Une classe permetttant de creer un club
 *
 */
public class Club {
	private List<Equipe> equipe=new ArrayList<Equipe>();
	private Session session;
	/**
	 * Constructeur à deux arguments(une liste dequipe et une liste de combat)
	 */
	public Club() {
		// TODO Auto-generated constructor stub
		this.equipe = null;
		this.session = null;
		
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}

	public Session getSession() {
		return session;
	}

	
	//fonction permettant d'ajouter une equipe qui reçoit en parametre une session

	public void creerEquipe(List<Equipe> equipe) {
		
	}
	//fonciton qui permet de creer une session qui reçoit en parametre une session
	public void CreerSession(Session session) {
		
	}
	
	//fonction qui permet d'arreter ou debuter une session
	public void arreterOuDebuterSession(Session session) {
		
		
	
	}
	//fonction qui permet de verifier si une session est encours
	/*public int isSessionStart(Session session) {
		
		return 0;
	}*/
	
	
	

}
