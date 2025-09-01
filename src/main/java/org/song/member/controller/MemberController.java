package org.song.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member/v1")
@RequiredArgsConstructor
public class MemberController {
    @PostMapping("/join")
    public void join(@RequestBody RequestJoin form, Error error){

    }

}
