package day12;

public class Book {
    private String name, author, publisher;
    private int numberOfPage;

    Book(String name, int numberOfPage, String author, String publisher) {
        setName(name);
        setAuthor(author);
        setPublisher(publisher);
        setNumberOfPage(numberOfPage);


    }
        public String getName() {
            return this.name;
        }
        public String getAuthor() {
            return this.author;
        }
        public String getPublisher() {
            return this.publisher;
        }
        public int getNumberOfPage() {
            return this.numberOfPage;
        }
    


        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setNumberOfPage(int size) {
            if(size<1) {
                System.out.println("Invalid number for page size.");
                this.numberOfPage = 10;
            }else{
                this.numberOfPage = size;
            }
        }

    }
