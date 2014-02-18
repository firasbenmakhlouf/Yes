package tn.edu.esprit.gl8.ds.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class User implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	private List<PeaceAgreement> peaceAgreement;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "peaceAgreement", cascade = CascadeType.ALL)
	public List<PeaceAgreement> getPeaceAgreement() {
		return peaceAgreement;
	}

	public void setPeaceAgreement(List<PeaceAgreement> peaceAgreement) {
		this.peaceAgreement = peaceAgreement;
	}
	public void LinkPeaceAgreementWithUser(List<Ligne> lignes) {
		this.lignes = lignes;
		for(Ligne c:lignes){
			c.setPerson(this);

}
