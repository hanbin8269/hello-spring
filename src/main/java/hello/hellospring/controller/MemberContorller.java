package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberContorller {

    private final MemberService memberService;

    @Autowired // Dependency injection (의존성 주입)
    public MemberContorller(MemberService memberService){
        this.memberService = memberService;
    }
}
