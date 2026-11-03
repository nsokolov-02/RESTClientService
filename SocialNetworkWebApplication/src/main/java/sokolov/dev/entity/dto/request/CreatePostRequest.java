package sokolov.dev.entity.dto.request;

public class CreatePostRequest {

    private final String author;
    private final String title;

    public CreatePostRequest(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
