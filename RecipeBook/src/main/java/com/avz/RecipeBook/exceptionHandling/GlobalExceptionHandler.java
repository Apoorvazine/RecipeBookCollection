package com.avz.RecipeBook.exceptionHandling;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ResourceNotFoundException.class})
	public ResponseEntity<String> hanlder(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		
		return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<HashMap<String, String>> validationHanlder(MethodArgumentNotValidException ex){
		
		List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
		
		HashMap<String, String> map=new HashMap<>();
		
		for(ObjectError err:allErrors) {
			
			String field = ((FieldError)err).getField();
			String defaultMessage = err.getDefaultMessage();
			map.put(field, defaultMessage);
		}
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
}