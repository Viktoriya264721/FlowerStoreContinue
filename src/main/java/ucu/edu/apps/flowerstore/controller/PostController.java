package ucu.edu.apps.flowerstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @GetMapping("/new")
    public String getPost() {
        return "Cool idea to use post";
    }
}