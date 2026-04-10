package day14;

public abstract  class Academician extends Worker {
    String department;
    String[] courses;

    public abstract void attendanceRecord() {
        System.out.println(name + " (Teacher) is in the building.");
        System.out.println("Department: " + department);
    }

    public void showCourses() {
        System.out.println(name + " teaches: ");
        for (String course : courses) {
            System.out.println(" - " + course);
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Academician(String name, String mail, String number, String department, String[] courses) {
        super(name, mail, number);
        this.department = department;
        this.courses = courses;
    }
}