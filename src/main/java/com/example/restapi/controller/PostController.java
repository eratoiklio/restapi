package com.example.restapi.controller;

import com.example.restapi.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @GetMapping("/posts")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("not implemented");
    }
    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id ){
        throw new IllegalArgumentException("not implemented");
    }
}
