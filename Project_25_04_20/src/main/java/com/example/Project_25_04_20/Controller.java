package com.example.Project_25_04_20;
import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping (path = "/")
    public String start () {
        return "start";
    }
    @GetMapping (path = "/a")
    public String a () {
        return "a";
    }
    @GetMapping (path = "/b")
    public String b () {
        return "b";
    }
    @GetMapping (path = "/c")
    public String c () {
        return "c";
    }
}