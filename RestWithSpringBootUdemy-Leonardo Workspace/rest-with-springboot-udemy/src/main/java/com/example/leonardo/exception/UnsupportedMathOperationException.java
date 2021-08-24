package com.example.leonardo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

	private static final long serialVersionUID = 1702099653991696303L;

	public UnsupportedMathOperationException(String exception) {
		super(exception);
	}

}
