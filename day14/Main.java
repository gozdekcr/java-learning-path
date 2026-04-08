package day14;

public class Main {
    public static void main(String[] args) {

        //Inheritance, overriding ,polymorphism
        
        String[] mathCourses = {"Calculus II", "Linear Algebra", "Differential Equations"};
        Teacher teacher = new Teacher("Emily Bennet","emily.bennet@uni.edu","012345","Mathematics",mathCourses,"Associate Professor");
        Worker.entry();

        teacher.attendanceRecord();
        teacher.showCourses();
        System.out.println("Rank: " + teacher.getRank());
        System.out.println();


        String[] csCourses = {"Intro to Programming", "Data Structures"};
        Assistant assistant = new Assistant("Liam Bennett","liam.bennett@uni.edu","098765","Computer Engineering",csCourses,"MSc Artificial Intelligence");
        Worker.entry();

        assistant.attendanceRecord();
        assistant.showCourses();
        System.out.println("Masters: " + assistant.getMasters());
        System.out.println(assistant);
        System.out.println();




        Clerk clerk = new Clerk("Sophia Reynolds","sophia.reynolds@uni.edu","835481","Secretary","A-101");
        Worker.entry();

        clerk.attendanceRecord();
        clerk.showRole();
        System.out.println("Office Room: " + clerk.getOfficeRoom());
        System.out.println();

        
        Accountant accountant = new Accountant("James Wilson","james.wilson@uni.edu","254823","Senior Accountant","B-205","Payroll & Budget Management");
        Worker.entry();

        accountant.attendanceRecord();
        accountant.showRole();
        System.out.println("Duties: " + accountant.getDuties());
        System.out.println(accountant);
        System.out.println();


        teacher.setRank("Full Professor");
        System.out.println("Updated rank: " + teacher.getRank());

        assistant.setMasters("PhD Computer Science");
        System.out.println("Updated masters: " + assistant.getMasters());



    }
}
