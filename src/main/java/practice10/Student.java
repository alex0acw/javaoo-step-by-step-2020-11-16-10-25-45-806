package practice10;

public class Student extends Person {
    protected Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.appendMember(this);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Student. I am %s Class %d.",
                this.getName(), this.getAge(),
                this.klass.getLeader() != null && this.klass.getLeader().equals(this) ? "Leader of" : "at",
                this.getKlass().getNumber());
    }
}