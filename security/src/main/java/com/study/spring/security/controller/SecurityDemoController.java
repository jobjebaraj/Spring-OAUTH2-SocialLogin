package com.study.spring.security.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1")
@Scope("prototype")
public class SecurityDemoController {


    @GetMapping
    public String getUser(Principal principal) {
        return "Hello --->  " +  principal.getName() + " Successfully Logged In using Oauth";
    }
}
