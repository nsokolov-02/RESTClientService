package sokolov.dev.entity.dto;

import java.time.LocalDate;

public class PostDto {

    private int id;
    private String author;
    private LocalDate creationDate;
    private int numberOfLikes;
    private int numberOfDislikes;
    private String title;

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
