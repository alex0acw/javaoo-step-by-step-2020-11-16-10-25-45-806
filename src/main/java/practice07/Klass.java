package practice07;

public class Klass {
    final Integer number;
    Student leader;

    public Klass(Integer classNum) {
        this.number = classNum;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student jerry) {
        this.leader = jerry;
    }
}
