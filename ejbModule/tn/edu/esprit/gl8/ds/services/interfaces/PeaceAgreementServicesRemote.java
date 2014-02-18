package tn.edu.esprit.gl8.ds.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.ds.domain.User;

@Remote
public interface PeaceAgreementServicesRemote {

	public void addUserWithManyPeaceAgreement(User user);

	public void removeUserWithManyPeaceAgreement(User user);
}
