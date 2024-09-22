package projetoServNuvem.minha_biblioteca_backend;

public class Book {
	//Attributes
	private String title;
    private String author;
    private String description;
    private String cover;
    
    //Constructor
    public Book(String title, String author, String description, String cover) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.cover = cover;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
