package com.example.leonardo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1702099653991696303L;

	public ResourceNotFoundException(String exception) {
		super(exception);
	}

}
