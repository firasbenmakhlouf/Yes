package tn.edu.esprit.gl8.ds.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: PeaceAgreement
 * 
 */
@Entity
public class PeaceAgreement implements Serializable {

	private int id;
	private String members;
	private String description;
	private static final long serialVersionUID = 1L;

	private PeaceAgreement peaceAgreement;

	public PeaceAgreement() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMembers() {
		return this.members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public PeaceAgreement getPeaceAgreement() {
		return peaceAgreement;
	}

	public void setPeaceAgreement(PeaceAgreement peaceAgreement) {
		this.peaceAgreement = peaceAgreement;
	}

}
