package sokolov.dev.entity.dto.request;

import sokolov.dev.entity.Post;

import java.time.LocalDateTime;

public class CreatePostRequest {

    private final String author;
    private final String title;

    public CreatePostRequest(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Post toEntity() {
        return new Post(
                author,
                LocalDateTime.now(),
                0,
                0,
                title
        );
    }
}
