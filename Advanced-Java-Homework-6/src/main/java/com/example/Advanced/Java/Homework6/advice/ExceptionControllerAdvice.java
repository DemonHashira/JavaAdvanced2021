package com.example.Advanced.Java.Homework6.advice;

import com.example.Advanced.Java.Homework6.exception.MissingId;
import com.example.Advanced.Java.Homework6.exception.NegativeSalary;
import com.example.Advanced.Java.Homework6.exception.NoNamePresented;
import com.example.Advanced.Java.Homework6.exception.NoSalary;
import com.example.Advanced.Java.Homework6.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MissingId.class)
    public ResponseEntity<ErrorDetails> exceptionForMissingId() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Missing Id for the employee");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

    @ExceptionHandler(NegativeSalary.class)
    public ResponseEntity<ErrorDetails> exceptionForNegativeSalary() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Negative salary for the employee");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

    @ExceptionHandler(NoNamePresented.class)
    public ResponseEntity<ErrorDetails> exceptionForNoNamePresented() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("No name presented for the employee");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

    @ExceptionHandler(NoSalary.class)
    public ResponseEntity<ErrorDetails> exceptionForNoSalary() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("No available salary for the employee");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}

