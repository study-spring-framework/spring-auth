package com.sparta.springauth.controller;

import com.sparta.springauth.security.UserDetailsImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j(topic = "홈컨트롤러")
public class HomeController {

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        model.addAttribute("username", userDetails.getUsername()); // 두번쨰인자: 실제 로그인 한 유저이름
        log.info(userDetails.getPassword());
        log.info(userDetails.getAuthorities().isEmpty()? "null" : "not null");
        return "index";
    }
}