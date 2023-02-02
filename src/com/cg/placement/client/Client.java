package com.cg.placement.client;

import com.cg.placement.entity.Certificate;
import com.cg.placement.service.CertificateService;
import com.cg.placement.service.CertificateServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Certificate certificate = new Certificate();
		CertificateService service = new CertificateServiceImpl();
		
		certificate.setId(1);
		certificate.setCyear(2019);
		certificate.setCcollege("DRAIT");
		
		service.addCertificate(certificate);
		System.out.println("Certificate Entered in the DB ");
	}

}
