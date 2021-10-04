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
	private List<Session> combat=new ArrayList<Session>();

	/**
	 * Constructeur à deux arguments(une liste dequipe et une liste de combat)
	 */
	public Club(List<Equipe> equipe, List<Session> combat) {
		// TODO Auto-generated constructor stub
		this.equipe=equipe;
		this.combat=combat;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}

	public List<Session> getCombat() {
		return combat;
	}

	public void setCombat(List<Session> combat) {
		this.combat = combat;
	}

}
