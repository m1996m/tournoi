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
	private List<Combat> combat=new ArrayList<Combat>();

	/**
	 * Constructeur à deux arguments(une liste dequipe et une liste de combat)
	 */
	public Club(List<Equipe> equipe, List<Combat> combat) {
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

	public List<Combat> getCombat() {
		return combat;
	}

	public void setCombat(List<Combat> combat) {
		this.combat = combat;
	}

}
