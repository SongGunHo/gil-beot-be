package org.song.globle.exceptons;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class BadRequestException extends CommonException {
    public BadRequestException() {
        super("BadRequest", HttpStatus.BAD_REQUEST);
    }

    public BadRequestException(String message){
      super(message, HttpStatus.BAD_REQUEST);
    }

    public BadRequestException(Map<String, List<
                String>> errorMessage){
      super(errorMessage, HttpStatus.BAD_REQUEST);
    }




}
