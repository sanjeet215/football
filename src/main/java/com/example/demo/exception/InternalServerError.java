package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RuntimeException {

	private static final long serialVersionUID = 6587819408360480861L;

	public InternalServerError() {
		super();
	}

	public InternalServerError(String message) {
		super(message);
	}

	public InternalServerError(String message, Throwable cause) {
		super(message, cause);
	}
}
