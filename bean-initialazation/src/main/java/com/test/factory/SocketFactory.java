package com.test.factory;

import java.net.Socket;

public class SocketFactory {

	private boolean sslEnabled;

	public static Socket getInstance() {
		System.out.println("Called getInstance()");

		try {
			Socket s = new Socket("127.0.0.1", 25);
			return s;
		} catch (Exception ex) {

			System.out.println("Unable to create the socket: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public static Socket getInstance(String host, int port) {

		System.out.println("Called getInstance(String host, int port)");

		try {
			Socket s = new Socket(host, port);
			return s;
		} catch (Exception ex) {

			System.out.println("Unable to create the socket: " + ex.getMessage());
			ex.printStackTrace();

		}
		return null;

	}

	public boolean isSslEnabled() {
		return sslEnabled;
	}

	public void setSslEnabled(boolean sslEnabled) {
		this.sslEnabled = sslEnabled;
	}

	public Socket newInstance() {
		System.out.println("Called newInstance()");

		try {
			Socket s = new Socket("127.0.0.1", 25);
			return s;
		} catch (Exception ex) {

			System.out.println("Unable to create the socket: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

}
