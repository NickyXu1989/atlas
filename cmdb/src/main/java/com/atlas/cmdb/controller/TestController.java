package com.atlas.cmdb.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('view_demo')")
    public String testFunc() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "cmdb. current user:" + auth.getName();
    }
}
