package com.mosambee;

public abstract class AbstractAttestationHandler {

	public static int HANDSHAKE = 10;
	public static int PROVISIONING = 20;
	public static int ENABLEMENT = 30;
	public static int TRANSACTION = 40;

	protected int level;

	protected AbstractAttestationHandler nextHandler;

	public void setNextHandler(AbstractAttestationHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void receiveRequest(int level, String message) {
		if (this.level <= level) {
			handleRequest(message);
		}
		if (nextHandler != null) {
			nextHandler.receiveRequest(level, message);
		}
	}

	abstract protected void handleRequest(String message);

}