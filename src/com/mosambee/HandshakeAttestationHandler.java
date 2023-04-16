package com.mosambee;



public class HandshakeAttestationHandler extends AbstractAttestationHandler {

    public HandshakeAttestationHandler(int level){
        this.level = level;
    }

        @Override
        protected void handleRequest (String message){
        System.out.println("Doing Handshake " + message);
    }

}