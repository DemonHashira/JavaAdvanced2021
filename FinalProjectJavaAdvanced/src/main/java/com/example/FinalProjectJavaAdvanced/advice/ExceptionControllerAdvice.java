package com.example.FinalProjectJavaAdvanced.advice;

import com.example.FinalProjectJavaAdvanced.exception.EntityDoesNotExist;
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

    @ExceptionHandler(EntityDoesNotExist.class)
    public ResponseEntity<String> exceptionEntityDoesNotExist(){
        return ResponseEntity
                .badRequest()
                .body("Entity does not exist");
    }
}
