package sokolov.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sokolov.dev.entity.Post;
import sokolov.dev.entity.dto.PostDto;
import sokolov.dev.entity.dto.PostsContainerDto;
import sokolov.dev.entity.dto.request.CreatePostRequest;
import sokolov.dev.entity.dto.request.UpdatePostRequest;
import sokolov.dev.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public PostsContainerDto findAll(){
        return postService.findAll();
    }

    @GetMapping("/posts/{id}")
    public PostDto findById(@PathVariable int id){
        return postService.findById(id);
    }

    @PostMapping("/posts")
    public PostDto save(@RequestBody CreatePostRequest request){
        return postService.save(request);
    }

    @PutMapping("/posts/{id}")
    public PostDto update(@PathVariable int id, @RequestBody UpdatePostRequest request){
        return postService.update(id, request);
    }

    @DeleteMapping("/posts/{id}")
    public void delete(@PathVariable int id) {
        postService.delete(id);
    }
}
