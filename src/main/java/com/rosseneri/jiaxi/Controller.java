package com.rosseneri.jiaxi;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("")
    public String home() {
        return "index";
    }
}
