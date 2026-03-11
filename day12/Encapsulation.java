package day12;

public class Encapsulation {
    public static void main(String[] args) {
        //Encapsulation
        //Inheritance
        //Polymorphism
        //Abstraction

        Book prideAndPrejudice = new Book("Pride & Prejudice", 351, "Jane Austen", "T. Egerton");
        prideAndPrejudice.setNumberOfPage(-487);
        System.out.println(prideAndPrejudice.getNumberOfPage());

        Book taleOfTwoCities = new Book("A Tale Two Cities", 376, "Charles Dickens", "Chapman & Hall");
        taleOfTwoCities.setName("A Tale of Two Cities");
        System.out.println(taleOfTwoCities.getName());

    

        
    }
    
}
