package com.cg.placement.service;

import com.cg.placement.entity.Certificate;

public interface CertificateService {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchcertificate(int id);
	public Certificate deleteCertificate(Certificate certificate);

}
