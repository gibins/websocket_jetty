package com.indocosmo.WebsocketExperiment1;

import java.io.FileOutputStream;
import java.security.KeyStore;

public class KeyStoreManagement {

	public static void main(String[] args) {
		
		
		try {
			
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			
			//keyStore = KeyStore.getInstance("PKCS12");
			

			char[] password = "password".toCharArray();
			keyStore.load(null, password);
						
			char[] keyStorePassword = "password".toCharArray();
			FileOutputStream keyStoreOutputStream = new FileOutputStream("./keystore.jks");
		    keyStore.store(keyStoreOutputStream, keyStorePassword);
		    
		    keyStorePassword = "password".toCharArray();
			keyStoreOutputStream = new FileOutputStream("./truststore.jks");
		    keyStore.store(keyStoreOutputStream, keyStorePassword);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
