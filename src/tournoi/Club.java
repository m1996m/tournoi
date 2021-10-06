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
	 * Constructeur � deux arguments(une liste dequipe et une liste de combat)
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

	
	//fonction permettant d'ajouter une equipe qui re�oit en parametre une session

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
	//fonciton qu i permet de creer une session qui re �oit en parametre une sessio n 
	public void CreerSession() {
		this.setSession(new Session());
		
	}
	
	public List<Joueur> tabJoueur(){
		List<Joueur> joueur =new ArrayList<Joueur>();
		for(int i=0;i<20;i++) {
			int p=40;
			Joueur J= new Joueur(i,"nom"+i,"prenom"+i,"adresse"+i,p,2021);
			joueur.add(J);
			p+=3;
			
		}
		return joueur;	
	}
	public void remplissageJoueurJoueur(Equipe equipe1, Equipe equipe2,Club club) {
		List<Joueur> joueur =new ArrayList<Joueur>();
		joueur=tabJoueur();
		for(int i=0;i<20;i++) {
			if(i<joueur.size()/2) {
				equipe1.getJoueur().add(joueur.get(0));
			}else {
				equipe2.getJoueur().add(joueur.get(1));
				
			}
			
		}
		
		
	}
	
	//fonction qui permet d'arreter ou debuter une session
	public void arreterOuDebuterSession(Session session) {
		
		
	
	}
	//fonction qui permet de verifier si une session est encours
	/*public int isSessionStart(Session session) {
		
		return 0;
	}*/
	
	
	

}
