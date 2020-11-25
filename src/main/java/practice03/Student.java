package practice03;

public class Student extends Person {
    protected final Integer classNum;

    public Integer getKlass() {
        return classNum;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", this.classNum);
    }

    public Student(String name, Integer age, Integer classNum) {
        super(name, age);
        this.classNum = classNum;
    }
}