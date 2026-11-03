package sokolov.dev.entity;

import jakarta.persistence.*;
import sokolov.dev.entity.dto.PostDto;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "author", nullable = false, length = 30)
    private String author;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "number_of_likes", nullable = false)
    private int numberOfLikes;

    @Column(name = "number_of_dislikes", nullable = false)
    private int numberOfDislikes;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    public Post() {
    }

    public Post(int id, String author, LocalDateTime creationDate, int numberOfLikes, int numberOfDislikes, String title) {
        this.id = id;
        this.author = author;
        this.creationDate = creationDate;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.title = title;
    }

    public Post(String author, LocalDateTime creationDate, int numberOfLikes, int numberOfDislikes, String title) {
        this.author = author;
        this.creationDate = creationDate;
        this.numberOfLikes = numberOfLikes;
        this.numberOfDislikes = numberOfDislikes;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfDislikes() {
        return numberOfDislikes;
    }

    public void setNumberOfDislikes(int numberOfDislikes) {
        this.numberOfDislikes = numberOfDislikes;
    }

    public PostDto toDto(){
        return new PostDto(
                id,
                author,
                creationDate.toLocalDate(),
                numberOfLikes,
                numberOfDislikes,
                title
        );
    }
}
