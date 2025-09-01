package org.song.member.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.song.member.controller.RequestJoin;
import org.song.member.repository.MemberRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
@Lazy
@RequiredArgsConstructor
public class JoinService {
    private final MemberRepository repository;
    private final PasswordEncoder encoder;
    private final ModelMapper mapper;


    public void process(RequestJoin form){
        Member member = mapper.map(form, Member.class);
        String password = form.get
    }
}
