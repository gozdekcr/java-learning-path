package day14;

public class Accountant extends Clerk {

    protected String duties;

    public Accountant(String name, String mail, String number, String role, String officeRoom, String duties) {
        super(name, mail, number, role, officeRoom);
        this.duties = duties;

    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    
}
