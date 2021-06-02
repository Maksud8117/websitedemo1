package com.website.roxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping("/about")
    public String about() { return "about"; }

    @RequestMapping("/blog")
    public String blog() { return "blog"; }

    @RequestMapping("/contact")
    public String contact() { return "contact"; }

    @RequestMapping("/single")
    public String single() { return "single"; }
}
