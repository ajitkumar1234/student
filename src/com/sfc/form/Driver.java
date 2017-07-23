package com.sfc.form;

import java.io.Serializable;

public class Driver implements Serializable {

	private static final long serialVersionUID = -4830992066652459428L;
	protected int id;
	protected String name;
	protected String mobile;

	public Driver() {
		super();
	}

	public Driver(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
