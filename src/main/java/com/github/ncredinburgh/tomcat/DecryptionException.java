package com.github.ncredinburgh.tomcat;

public class DecryptionException extends Exception {

		public DecryptionException(Throwable t) {
			super(t);
		}
		
		public DecryptionException(String message) {
			super(message);
		}
}
