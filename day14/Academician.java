package day14;

public class Academician extends Worker {
    String department, duties;
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

    public void 




}
