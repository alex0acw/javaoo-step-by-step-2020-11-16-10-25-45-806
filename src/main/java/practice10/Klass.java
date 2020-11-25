package practice10;

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

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    Teacher teacher;
    Student leader;

    public Klass(Integer classNum) {
        this.number = classNum;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if (this.studentList.contains(student)) {
            this.leader = student;
            if (this.teacher != null) this.teacher.announceNewLeader(student, this);
        } else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        this.studentList.add(student);
        if (this.teacher != null) this.teacher.announceNewMember(student, this);
        student.klass = this;
    }
}
