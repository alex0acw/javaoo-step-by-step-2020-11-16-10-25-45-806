package practice09;

public class Person {

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    final String name;
    final Integer age;
    final Integer id;

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return this.name.equals(person.name) && this.age.equals(person.age) && this.id.equals(person.id);
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
