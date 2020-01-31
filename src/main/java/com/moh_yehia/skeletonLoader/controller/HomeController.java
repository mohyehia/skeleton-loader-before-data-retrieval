package com.moh_yehia.skeletonLoader.controller;

import com.moh_yehia.skeletonLoader.entity.Post;
import com.moh_yehia.skeletonLoader.service.framework.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String viewHome(){
        return "index";
    }

    @PostMapping("/fetch")
    @ResponseBody
    public List<Post> retrievePosts(){
        return postService.findAll();
    }
}
