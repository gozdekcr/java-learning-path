package day14;

public class Worker {

    String name , mail;
    int number;
    static int entryCount=0;

    public void attendanceRecord() {
        System.out.println("Employee is in the building.");
    }

    public static int entry() {
        return ++Worker.entryCount;
    }

    
}