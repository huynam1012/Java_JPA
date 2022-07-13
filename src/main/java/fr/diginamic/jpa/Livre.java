package fr.diginamic.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {

    @Id
    @Column(name = "ID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GenericGenerator(name = "seqLivre", strategy = "increment")
    private int id;

    @Column(name = "TITRE", nullable = false)
    private String titre;

    @Column(name = "AUTEUR", length = 50, nullable = false)
    private String auteur;
    
    

	/** Constructeurs
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Livre(int id, String titre, String auteur) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}


	/** Constructeurs
	 * 
	 */
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Livre(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
	}


	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/** Getter
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}


	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livre [id=");
		builder.append(id);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", auteur=");
		builder.append(auteur);
		builder.append("]");
		return builder.toString();
	}
}
