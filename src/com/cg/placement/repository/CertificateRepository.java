package com.cg.placement.repository;

import com.cg.placement.entity.Certificate;

public interface CertificateRepository {
//	addCertificate(Certificate certificate) + updateCertificate(Certificate certificate) + searchCertificate(long id) + deleteCertificate(long id)
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	
	public Certificate deleteCertificate(Certificate certificate);
	void deleteCertificate(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
