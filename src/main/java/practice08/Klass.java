package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public Integer getNumber() {
        return number;
    }

    protected List<Student> studentList = new ArrayList<>();
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
        if (this.studentList.contains(jerry))
            this.leader = jerry;
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        this.studentList.add(student);
    }
}
