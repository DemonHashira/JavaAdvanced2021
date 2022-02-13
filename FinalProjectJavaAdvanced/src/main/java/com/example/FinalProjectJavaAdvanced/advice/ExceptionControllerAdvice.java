package com.example.FinalProjectJavaAdvanced.advice;

import com.example.FinalProjectJavaAdvanced.exception.UserDoesNotExist;
import com.example.FinalProjectJavaAdvanced.exception.WrongArguments;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(WrongArguments.class)
    public ResponseEntity<String> exceptionWrongArguments(){
        return ResponseEntity
                .badRequest()
                .body("This is a wrong argument!");
    }

    @ExceptionHandler(UserDoesNotExist.class)
    public ResponseEntity<String> exceptionUserDoesNotExist(){
        return ResponseEntity
                .badRequest()
                .body("This is body message of the UserDoesNotExist exception");
    }
}
