package com.mosambee;

public class ProvisioningAttestationHandler extends AbstractAttestationHandler {

	public ProvisioningAttestationHandler(int level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
		System.out.println("Doing Provisioning  " + message);
	}

}