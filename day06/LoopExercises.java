package day06;

public class LoopExercises {
    public static void main(String[] args) {

        System.out.println("while loop");
        //WHILE LOOP 
        //If the condition is false from the start, the body never executes
        int i = 1;

        while(i<=5) {
            System.out.print(i + ",");
            i++;
        }
        System.out.println(); // new line

        
        System.out.println("do-while loop");
        //DO-WHILE LOOP
        //The body executes at least once even if the condition is false
        int j = 10;

        do { 
            System.out.print(j + ",");
            j++;
        } while (j<=5);


    }
}
