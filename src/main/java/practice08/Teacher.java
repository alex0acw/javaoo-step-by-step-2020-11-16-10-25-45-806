package practice08;

public class Teacher extends Person {
    protected final Klass Klass;

    public Teacher(Integer id, String name, Integer age, practice08.Klass klass) {
        super(id, name, age);
        Klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        Klass = null;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                this.getName(), this.getAge(),
                this.Klass == null ? "No Class" : String.format("Class %d", this.Klass.getNumber()));
    }

    public practice08.Klass getKlass() {
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
