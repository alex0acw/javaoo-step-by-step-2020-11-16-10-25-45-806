package practice04;

public class Person {

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    final String name;
    final Integer age;

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
