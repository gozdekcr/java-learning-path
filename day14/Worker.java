package day14;

public class Worker {

    String name , mail;
    String number;
    static int entryCount=0;

    public Worker(String name, String mail, String number) {
        this.name = name;
        this.mail = mail;
        this.number = number;

    }

    protected void attendanceRecord() {
        System.out.println("Employee is in the building.");
    }

    public static int entry() {
        return ++Worker.entryCount;
    }


    
}