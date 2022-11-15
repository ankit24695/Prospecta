package com.example.demo.exception;

import java.time.LocalDate;

public class MyErrorDetails {

	private LocalDate timestamp;
	
	private String message;
	private String description;
	
	public MyErrorDetails(LocalDate timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
