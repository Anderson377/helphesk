package com.andersondolce.helpdesk.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String fieldname;
	private String message;
	
	
	public FieldMessage() {
		super();
	}


	public FieldMessage(String fieldname, String message) {
		super();
		this.fieldname = fieldname;
		this.message = message;
	}


	public String getFieldname() {
		return fieldname;
	}


	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
