package day17;

import java.util.ArrayList;

public class LibraryMember {
    public static void main(String[] args) {
        System.out.println("midterm");
    }

    String name;
    ArrayList<String> borrowedBooks = new ArrayList<>();
    static int totalMembers = 0;

    public LibraryMember (String name){
        this.name = name;
        borrowedBooks = new ArrayList<>();
        totalMembers++;
    }

    public void borrowBook(String bookName) {
        borrowedBooks.add(bookName);
    }

    public void returnBook(String bookName) {
        if(!(borrowedBooks.contains(bookName))) {
            System.out.println("Book not found!");
        }else {
            borrowedBooks.remove(bookName);
        }
    }

    public String toString(){
        return "Name: " + name + " Borrowed Books: " + borrowedBooks;
    }
}