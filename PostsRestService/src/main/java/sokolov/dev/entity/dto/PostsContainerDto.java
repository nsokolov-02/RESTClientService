package sokolov.dev.entity.dto;

import java.util.List;

public class PostsContainerDto {

    private final List<PostDto> posts;

    public PostsContainerDto(List<PostDto> posts) {
        this.posts = posts;
    }

    public List<PostDto> getPosts() {
        return posts;
    }
}
