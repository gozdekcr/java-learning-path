package day14;

public class Main {
    public static void main(String[] args) {

        //Inheritance, overriding ,polymorphism
        
        Clerk c = new Clerk();
        c.name = "Bob";
        c.role = "Registrar";
        c.officeRoom = "Office 101";

        c.attendanceRecord();
        c.showRole();
        Worker.entry();

        System.out.println("-----------------");

        Academician t = new Academician();
        t.name = "Alice";
        t.department = "Science";
        t.courses = new String[]{"Math", "Physics"};
        t.duties = "Homeroom teacher";

        t.attendanceRecord();
        t.showCourses();
        Worker.entry();

        Worker w = new Academician();
        w.name = "Mia";
        w.department= "Math";
        
    }

}
