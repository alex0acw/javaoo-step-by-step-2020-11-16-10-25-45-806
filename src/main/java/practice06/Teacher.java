package practice06;

public class Teacher extends Person {
    protected final Klass Klass;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                this.getName(), this.getAge(),
                this.Klass == null ? "No Class" : String.format("Class %d", this.Klass.getNumber()));
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
        Klass = null;
    }

    public Klass getKlass() {
        return this.Klass;
    }

    public String introduceWith(Student student) {
        return String.format(
                "My name is %s. I am %d years old. I am a Teacher. I %s %s.",
                getName(), getAge(),
                this.getKlass().equals(student.getKlass()) ? "teach" : "don't teach",
                student.getName()
        );
    }
}
