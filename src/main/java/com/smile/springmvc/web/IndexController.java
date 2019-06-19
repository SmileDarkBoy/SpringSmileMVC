package com.smile.springmvc.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    private static final String INDEX = "index";

    @RequestMapping("/show")
    public String getIndex() {
        return INDEX;
    }
}
