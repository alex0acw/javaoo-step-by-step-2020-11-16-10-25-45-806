package practice07;

public class Klass {
    public Integer getNumber() {
        return number;
    }

    final Integer number;

    public Student getLeader() {
        return leader;
    }

    Student leader;

    public Klass(Integer classNum) {
        this.number = classNum;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student jerry) {
        this.leader = jerry;
    }
}
