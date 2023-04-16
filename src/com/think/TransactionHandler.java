package com.think;

public class TransactionHandler extends AbstractAttestationHandler {

	public TransactionHandler(int level) {
		this.level = level;
	}

	@Override
	protected void handleRequest(String message) {
		System.out.println("Doing Transaction " + message);
	}

}