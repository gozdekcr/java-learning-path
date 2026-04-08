package day14;

import java.util.Arrays;

public class Assistant extends Academician {
  
    protected String masters;

    public Assistant(String name, String mail, String number, String department, String[] courses, String masters) {
      super(name, mail, number, department, courses);
      this.masters = masters;
    }

    public String getMasters() {
      return masters;
    }

    public void setMasters(String masters) {
      this.masters = masters;
    }

    @Override
    public String toString() {
      return "Assistant [name=" + name + ", mail=" + mail + ", department=" + department + ", masters=" + masters
          + ", courses=" + Arrays.toString(courses) + ", number=" + number + "]";
    }
  }

  
  
    
    

