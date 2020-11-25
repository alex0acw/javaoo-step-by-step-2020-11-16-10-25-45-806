package practice04;

public class Worker extends Person {
    @Override
    public String introduce() {
        return String.format(
                "My name is %s. I am %d years old. I am a Worker. I have a job.",
                this.getName(), this.getAge());
    }

    public Worker(String name, Integer age) {
        super(name, age);
    }
}
