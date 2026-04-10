package day14;

public class Worker {

    protected String name , mail;
    protected String number;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

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