package sokolov.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sokolov.dev.entity.Post;
import sokolov.dev.entity.dto.PostDto;
import sokolov.dev.entity.dto.PostsContainerDto;
import sokolov.dev.entity.dto.request.CreatePostRequest;
import sokolov.dev.entity.dto.request.UpdatePostRequest;
import sokolov.dev.repository.PostRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostsContainerDto findAll() {
        List<PostDto> posts = postRepository.findAll().stream()
                .map(Post::toDto).toList();
        return new PostsContainerDto(posts);
    }

    public PostDto findById(int id) {
        return postRepository.findById(id)
                .map(Post::toDto)
                .orElseThrow(() -> new IllegalArgumentException("Post with id = " + id + " not found"));
    }

    public PostDto save(CreatePostRequest request) {
        Post post = request.toEntity();
        return postRepository.save(post).toDto();
    }

    public PostDto update(int id, UpdatePostRequest request){
        return postRepository.findById(id)
                .map(existingPost -> {
                    Post updatedPost = request.toEntity(existingPost.getId(), existingPost.getCreationDate());
                    return postRepository.save(updatedPost).toDto();
                })
                .orElseThrow(() -> new IllegalArgumentException("Post with id = " + id + " not found"));
    }

    public void delete(int id) {
        postRepository.deleteById(id);
    }
}
