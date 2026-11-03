package sokolov.dev.entity.dto.request;

import sokolov.dev.entity.Post;

import java.time.LocalDateTime;

public class UpdatePostRequest {

    private final String author;
    private final int numberOfLikes;
    private final int numberOfDislikes;
    private final String title;

    public UpdatePostRequest(String author, int numberOfLikes, int numberOfDislikes, String title) {
        this.author = author;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.title = title;
    }

    public Post toEntity(int id, LocalDateTime creationDate){
        return new Post(
                id,
                author,
                creationDate,
                numberOfLikes,
                numberOfDislikes,
                title
        );
    }
}
