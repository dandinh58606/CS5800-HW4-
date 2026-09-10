package aggregation;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String book_title, String book_author, String book_publisher){
        this.title = book_title;
        this.author = book_author;
        this.publisher = book_publisher;
    }

    public String get_title(){
        return title;
    }

    public void set_title(String new_title){
        this.title = new_title;
    }

    public String get_author(){
        return author;
    }

    public void set_author(String new_author){
        this.author = new_author;
    }

    public String get_publisher(){
        return publisher;
    }

    public void set_publisher(String new_publisher){
        this.publisher = new_publisher;
    }
}
