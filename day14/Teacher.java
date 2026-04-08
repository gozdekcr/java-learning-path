package day14;

public class Teacher extends Academician {

  String rank;

  public Teacher(String name, String mail, String number, String department, String[] courses, String rank) {
    super(name, mail, number, department, courses);
    this.rank = rank;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher{");
        sb.append("rank=").append(rank);
        sb.append('}');
        return sb.toString();
    }

  
    
}
