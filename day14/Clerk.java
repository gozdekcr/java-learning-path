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

    public Clerk(String name, String mail, String number, String role, String officeRoom) {
        super(name, mail, number);
        this.role = role;
        this.officeRoom = officeRoom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(String officeRoom) {
        this.officeRoom = officeRoom;
    }
}