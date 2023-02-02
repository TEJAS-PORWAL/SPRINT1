package com.cg.placement.service;

import com.cg.placement.entity.Certificate;
import com.cg.placement.repository.CertificateRepository;
import com.cg.placement.repository.CertificateRepositoryImpl;

public class CertificateServiceImpl implements CertificateService{

//	Establishing the connection between Service and Repository
	private CertificateRepository dao;
	
	public CertificateServiceImpl() {
		dao = new CertificateRepositoryImpl();
	}
	
	@Override
	public Certificate addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchcertificate(int id) {
		// TODO Auto-generated method stub
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deleteCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

}
