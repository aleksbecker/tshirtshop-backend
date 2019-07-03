package com.turing.tshirtshop.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException e) {
		return response("Invalid route", e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> handleNumberFormatException(NumberFormatException e) {
		return response("Invalid Query", e.getMessage(), HttpStatus.BAD_REQUEST);
	}

	private static String createJson(String message, String reason) {
		return "{\"error\" : \"" + message + "\"," + "\"reason\" : \"" + reason + "\"}";
	}

	private static ResponseEntity<String> response(String message, String reason, HttpStatus httpStatus) {
		String json = createJson(message, reason);
		return new ResponseEntity<>(json, httpStatus);
	}
}
