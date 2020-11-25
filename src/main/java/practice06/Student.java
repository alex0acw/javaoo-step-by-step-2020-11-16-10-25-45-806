package practice06;

public class Student extends Person {
    protected final Klass klass;

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.",
                this.getName(), this.getAge(), this.getKlass().getNumber());
    }

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
}