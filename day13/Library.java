package day13;

public class Library {
    private String libraryName;
    private int bookCount;

    private Books[] books = new Books[5];


    Library(String libraryName, int capasity) {
        this.libraryName = libraryName;
        this.books = new Books[capasity];  
        this.bookCount = 0;
    }

    public void addBook(Books book) {
        if (bookCount >= books.length) {
            System.out.println("Library is full!");
            return;
    }
    books[bookCount] = book;
    bookCount++;        
    }

    public void listBooks(){
        System.out.println("=== " + libraryName + " ===");
        for(int i=0 ; i< bookCount ; i++ ) {
            System.out.println((i+1) + ". " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor().getName());
            System.out.println("Pages: " + books[i].getNumberOfPages());
        }
    }

    public void findByAuthor(String authorName) {
    for (int i = 0; i < bookCount; i++) {

        String booksAuthorName = books[i].getAuthor().getName();

        if (booksAuthorName.equals(authorName)) {
            System.out.println("- " + books[i].getTitle());
        }
    }
}


    
}
