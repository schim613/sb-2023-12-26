package com.ll.sb20231226.domain.article.article.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/list")
    public String list() {
        return "domain/article/article/list";
    }
}