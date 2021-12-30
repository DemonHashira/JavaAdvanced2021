package com.example.lecture14.controllers.advice;

import com.example.lecture14.exception.StudentException;
import com.example.lecture14.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(StudentException.class)
    public ResponseEntity<ErrorDetails> exceptionForStudentsNotExisting() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("We don't have any students yet.");
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
