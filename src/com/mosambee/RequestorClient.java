package com.mosambee;

public class RequestorClient {

	public static AbstractAttestationHandler getHandlerChain() {

		AbstractAttestationHandler handshakeAttestationHandler = new HandshakeAttestationHandler(
				AbstractAttestationHandler.HANDSHAKE);
		AbstractAttestationHandler provisioningAttestationHandler = new ProvisioningAttestationHandler(
				AbstractAttestationHandler.PROVISIONING);
		AbstractAttestationHandler enablementAttestationHandler = new EnablementAttestationHandler(
				AbstractAttestationHandler.ENABLEMENT);

		AbstractAttestationHandler transactionHandler = new TransactionHandler(AbstractAttestationHandler.ENABLEMENT);

		handshakeAttestationHandler.setNextHandler(provisioningAttestationHandler);
		provisioningAttestationHandler.setNextHandler(enablementAttestationHandler);
		enablementAttestationHandler.setNextHandler(transactionHandler);

		return handshakeAttestationHandler;
	}

}