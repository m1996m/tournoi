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
		//this.equipe = null;
		//this.session = null;	
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

	public void setSession(Session session) {
		this.session = session;
	}

	public void creerEquipe() {
		
		Equipe equipe1=new Equipe();
		Equipe equipe2=new Equipe();
		List<Equipe> l=new ArrayList<Equipe>();
		l.add(equipe1);
		l.add(equipe2);
		this.setEquipe(l);	
	}
	//fonciton qu i permet de creer une session qui re çoit en parametre une sessio n 
	public void CreerSession() {
		this.setSession(new Session());
		
	}
	
	//fonction qui permet d'arreter ou debuter une session
	public void arreterOuDebuterSession(Session session) {
		
		
	
	}
	//fonction qui permet de verifier si une session est encours
	/*public int isSessionStart(Session session) {
		
		return 0;
	}*/
	
	
	

}
