package org.song.member.enitty;

import lombok.Data;

@Data
public class MemerEnitiry {
    private String mid;
    private String password;
    private String confirPassword;
    private String email;
    private String mobile;
    private boolean termsAgree; // 약관 동의


}
