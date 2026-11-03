package sokolov.dev.entity.dto;

import java.time.LocalDate;

public class PostDto {

    private final int id;
    private final String author;
    private final LocalDate creationDate;
    private final int numberOfLikes;
    private final int numberOfDislikes;
    private final String title;

    public PostDto(int id, String author, LocalDate creationDate, int numberOfLikes, int numberOfDislikes, String title) {
        this.id = id;
        this.author = author;
        this.creationDate = creationDate;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public int getNumberOfDislikes() {
        return numberOfDislikes;
    }

    public String getTitle() {
        return title;
    }
}
