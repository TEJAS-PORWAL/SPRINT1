package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entity.Certificate;

public class CertificateRepositoryImpl implements CertificateRepository {

	
//	start the JPA Lifecycle
	private EntityManager entityManager;
	public CertificateRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Certificate addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		// TODO Auto-generated method stub
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		entityManager.remove(certificate);
		return certificate;
	}

	@Override
	public void deleteCertificate(int id) {
		// TODO Auto-generated method stub
		Certificate certificate = entityManager.find(Certificate.class, id);
		entityManager.remove(certificate);
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

}
