package day14;

public class Clerk extends Worker {
    String role;
    String officeRoom;

    public void attendanceRecord() {
        System.out.println(name + " (Clerk) is in the building.");
        System.out.println("Office: " + officeRoom);
    }

    public void showRole() {
        System.out.println(name + " works as: " + role);
    }



}
