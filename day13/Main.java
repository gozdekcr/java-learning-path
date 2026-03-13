package day13;

public class Main {
    public static void main(String[] args) {
    Author a1 = new Author("Jane Austen", "British", 1775);
    Author a2 = new Author("George Orwell", "British", 1903);
    Author a3 = new Author("Fyodor Dostoyevski", "Russian", 1821);

    Books b1 = new Books("Pride & Prejudice", 364, a1);
    Books b2 = new Books("1984", 333, a2);
    Books b3 = new Books("Animal Farm", 179, a2);
    Books b4 = new Books("Crime and Punishment", 668, a3);

    Library lib = new Library("Istanbul Library", 5);
    lib.addBook(b1);
    lib.addBook(b2);
    lib.addBook(b3);
    lib.addBook(b4);

    lib.listBooks();

    System.out.println();
    System.out.println("--- findByAuthor Test ---");
    lib.findByAuthor("George Orwell");

    }
    
}
