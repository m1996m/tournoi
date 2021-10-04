package tournoi;
import java.util.ArrayList;
import java.util.*;

/**
 * @author DELL
 *Class permettant de creer un combat
 */
public class Session {
	// Declaration des attributs equipe1,equipe2 et nombrebre de Manche
	private Equipe equipe1;
	private Equipe equipe2;
	private int nombreManche;

	/**
	 * Construct avec trois arguments qui sont: equipe1,equipe2 et le nombre de manche
	 */
	public Session(Equipe equipe1,Equipe equipe2, int nombreManche) {
		// TODO Auto-generated constructor stub
		this.equipe1=equipe1;
		this.equipe2=equipe2;
		this.nombreManche=nombreManche;
	}

	public Equipe getEquipe1() {
		return equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

	public int getNombreManche() {
		return nombreManche;
	}

	public void setNombreManche(int nombreManche) {
		this.nombreManche = nombreManche;
	}

}
