package com.counteryservice.Controller;

public class AddResponse {
	private String msg;
	private int id;

	public AddResponse(String msg, int id) {
		super();
		this.msg = msg;
		this.id = id;
	}

	public AddResponse() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
