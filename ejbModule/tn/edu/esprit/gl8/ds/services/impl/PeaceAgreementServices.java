package tn.edu.esprit.gl8.ds.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.ds.domain.User;
import tn.edu.esprit.gl8.ds.services.interfaces.PeaceAgreementServicesLocal;
import tn.edu.esprit.gl8.ds.services.interfaces.PeaceAgreementServicesRemote;

/**
 * Session Bean implementation class PeaceAgreementServices
 */
@Stateless
@LocalBean
public class PeaceAgreementServices implements PeaceAgreementServicesRemote,
		PeaceAgreementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PeaceAgreementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUserWithManyPeaceAgreement(User user) {
		entityManager.persist(user);

	}

	@Override
	public void removeUserWithManyPeaceAgreement(User user) {
		entityManager.remove(entityManager.merge(user));
	}

}
