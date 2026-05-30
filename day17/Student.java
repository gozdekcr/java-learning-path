package day17;

public class Student extends CourseMember {
    private double midterm;
    private double lab;
    private double finalExam;

    public Student(String name, int id, double midterm, double lab, double finalExam){
        super(name, id);
        this.midterm = midterm;
        this.lab = lab;
        this.finalExam = finalExam;
    }

    public double calculateScore() {
        return 0.35 * midterm + 0.15 * lab + 0.5 * finalExam;
    }

    public String toString() {
        return super.toString() + " Midterm: " + midterm + " Lab: " + lab + " Final: " + finalExam + " Score: " + calculateScore(); 
    }
    public static void main(String[] args) {
        Student st1 =new Student("gözde", 364, 66, 88, 98);
        System.out.println(st1.toString());
    }
}