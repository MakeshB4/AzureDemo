package com.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
// Comments
    private Date timestamp;
    private String message;

}
