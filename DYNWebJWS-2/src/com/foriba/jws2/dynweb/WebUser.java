package com.foriba.jws2.dynweb;

import java.io.Serializable;

public class WebUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public WebUser() {
	}

	public WebUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
