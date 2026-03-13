package day13;

public class Author {

    private String name, nationality;
    private int birthYear;

    Author(String name, String nationality , int birthYear) {
        setName(name);
        setNationality(nationality);
        setBirthYear(birthYear);
    }

    public String getName() {
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public int getBirthYear() {
        return this.birthYear;
    }


    public void setName(String name) {
        if(name == null){
            this.name = "Unknown";
        }else {
            this.name = name;
        }
    }

    public void setNationality(String nationality) {
        if(nationality==null) {
            this.nationality = "Unknown";
        }else {
            this.nationality = nationality;
        }
    }

    public void setBirthYear(int birthYear) {
        if(birthYear<1000 || birthYear>2026) {
            System.out.println("Please enter a valid date.");
            this.birthYear = 0;
        }else {
            this.birthYear = birthYear;
        }
    }
    

}

