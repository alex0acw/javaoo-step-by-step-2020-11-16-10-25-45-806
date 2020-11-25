package practice05;

public class Student extends Person {
    protected final Integer classNum;

    public Student(String name, Integer age, Integer classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public Integer getKlass() {
        return classNum;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.",
                this.getName(), this.getAge(), this.getKlass());
    }
}