package org.song.globle.exceptons;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class UnAuthorizedException extends CommonException {
    public UnAuthorizedException() {
        super("Unauthorized", HttpStatus.UNAUTHORIZED);
    }
    public UnAuthorizedException(String messge){
      super(messge, HttpStatus.UNAUTHORIZED);
    }
    public UnAuthorizedException(Map<String , List<String>>errorMessage){
      super(errorMessage, HttpStatus.UNAUTHORIZED);
    }
}
