package com.mosambee;

public class EnablementAttestationHandler extends AbstractAttestationHandler {

	public EnablementAttestationHandler(int level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
		System.out.println("Doing Enablement " + message);
	}

}