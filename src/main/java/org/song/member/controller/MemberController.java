package org.song.member.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.song.globle.libs.Utils;
import org.song.member.services.JoinService;
import org.song.member.validator.JoinValidator;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member/v1")
@RequiredArgsConstructor
public class MemberController {
    private final JoinValidator validator;
    private final JoinService service;
    private final Utils utils;

    @PostMapping("/join")
    public void join(@RequestBody RequestJoin form, Errors errors){
        validator.process(form, errors);

        if(errors.hasErrors()){
            throw  new BadRequestException(utils.getMessage(errors));
        }
        service.process(form);
    }

}
