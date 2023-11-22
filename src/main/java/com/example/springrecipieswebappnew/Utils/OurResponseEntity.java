package com.example.springrecipieswebappnew.Utils;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class OurResponseEntity extends ResponseEntity {
    public OurResponseEntity(HttpStatusCode status) {
        super(status);
    }
}
