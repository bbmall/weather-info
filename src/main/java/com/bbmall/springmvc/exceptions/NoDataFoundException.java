package com.bbmall.springmvc.exceptions;

/**
 * Created by bmalinowski on 12.05.18.
 */
public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException(String message) {
        super(message);
    }
}
