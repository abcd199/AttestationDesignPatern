package com.think;

import org.junit.jupiter.api.Test;

public class RequestorClientTest {

	@Test
	public void testGetHandlerChain() throws Exception {

		AbstractAttestationHandler handler = RequestorClient.getHandlerChain();
		handler.receiveRequest(AbstractAttestationHandler.TRANSACTION, " New Transaction Arrived");

	}
}