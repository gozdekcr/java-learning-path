package day13;

public class Books {

    private String title;
    private int numberOfPages;
    private Author author;

    Books(String title, int numberOfPage , Author author) {
        setTitle(title);
        setNumberOfPages(numberOfPage);
        setAuthor(author);

    }

    public String getTitle() {
        return this.title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        if(title == null) {
            this.title = "Unknown";
        }else {
            this.title = title;
        }
    }

    public void setNumberOfPages(int numberOfPage) {
        if(numberOfPage<1) {
            System.out.println("Enter a valid number for page number");
            this.numberOfPages= 1;
        }else {
            this.numberOfPages= numberOfPage;
        }
    }

    public void setAuthor(Author author) {
        if(author == null) {
            System.out.println("Author can not be empty!");
        }else {
            this.author = author;
        }
    }
    





}
