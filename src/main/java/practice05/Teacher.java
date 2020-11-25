package practice05;

public class Teacher extends Person {
    protected final Integer Klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        Klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
        Klass = null;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                this.getName(), this.getAge(),
                this.Klass == null ? "No Class" : String.format("Class %d", this.Klass));
    }

    public Integer getKlass() {
        return this.Klass;
    }
}
