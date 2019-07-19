package com.test.bean;

public class ConnectionConfig {
	private String host;
	private int port;
	private int socketTimeOut;
	private int readTimeOut;

	public ConnectionConfig() {
		host = "127.0.0.1";
		port = 80;
		socketTimeOut = 10000;
		readTimeOut = 10000;
	}

	@Override
	public String toString() {
		return "ConnectionConfig [host=" + host + ", port=" + port + ", socketTimeOut=" + socketTimeOut
				+ ", readTimeOut=" + readTimeOut + "]";
	}

	public ConnectionConfig(String host, int port, int socketTimeOut, int readTimeOut) {
		this.host = host;
		this.port = port;
		this.socketTimeOut = socketTimeOut;
		this.readTimeOut = readTimeOut;
	}
	public ConnectionConfig(String host) {
		this.host = host;
	}

}
