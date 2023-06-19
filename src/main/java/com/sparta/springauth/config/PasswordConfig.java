package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Class위에 @Configuration추가
        // Bean으로 등록하고자 하는 객체를 반환하는 메서드를 선언후 Bean 어노테이션 추가
        return new BCryptPasswordEncoder(); // passwordEncoder에 있는 구현체를 선택 해준것이다
        // DI를 받으면 BCryptPasswordEncoder(비민번호를 암호화 해주는 Hash 함수 - 강력한 hash 메커니즘) 구현체가 등록이 된다
    }
}