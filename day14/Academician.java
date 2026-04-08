package day14;

public class Academician extends Worker {
    String department;
    String[] courses;

    public void attendanceRecord() {
        System.out.println(name + " (Teacher) is in the building.");
        System.out.println("Department: " + department);
    }

    public void showCourses() {
        System.out.println(name + " teaches: ");
        for (String course : courses) {
            System.out.println(" - " + course);
        }
    }

    public Academician(String name, String mail, String number, String department, String[] courses) {
        super(name, mail, number);
        this.department = department;
        this.courses = courses;
    }

    @Override
    public String toString() {
    return "------------------------------\n" +
           " ACADEMICIAN INFORMATION \n" +
           "------------------------------\n" +
           " Name       : " + name + "\n" +
           " E-mail     : " + mail + "\n" +
           " Department : " + department + "\n" +
           " Phone      : " + number + "\n" +
           " Courses    : " + java.util.Arrays.toString(courses) + "\n" +
           "------------------------------";
    }

    

 




}
