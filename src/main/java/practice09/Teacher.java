package practice09;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    protected final LinkedList<Klass> classList;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> classList) {
        super(id, name, age);
        this.classList = classList;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        this.classList = new LinkedList<>();
    }

    @Override
    public String introduce() {
        List<String> classNumStrList = this.classList.stream().map(Klass::getNumber).map(Object::toString).collect(Collectors.toList());
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                this.getName(), this.getAge(),
                this.classList.size() == 0 ? "No Class" :
                        "Class " + String.join(", ", classNumStrList)
        );
    }

    public String introduceWith(Student student) {
        return String.format(
                "My name is %s. I am %d years old. I am a Teacher. I %s %s.",
                getName(), getAge(),
                this.isTeaching(student) ? "teach" : "don't teach",
                student.getName()
        );
    }

    public boolean isTeaching(Student student1) {
        return this.classList.stream()
                .anyMatch(klass -> klass.studentList.stream()
                        .anyMatch(student -> student.equals(student1)));
    }

    public List<Klass> getClasses() {
        return this.classList;
    }
}
