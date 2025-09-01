package org.song.globle.exceptons;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class NotFoundException extends CommonException {
    public NotFoundException() {

      super("NotFound", HttpStatus.NOT_FOUND);
    }

    public NotFoundException(String message){
      super(message, HttpStatus.NOT_FOUND);
    }
    public NotFoundException(Map<String , List<String>>errorMessage){
      super(errorMessage, HttpStatus.NOT_FOUND);
    }
}

