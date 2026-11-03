package sokolov.dev.entity.dto.request;

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

    public String getAuthor() {
        return author;
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
