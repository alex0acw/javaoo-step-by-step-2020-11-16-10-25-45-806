package practice06;

public class Klass {
    final Integer number;

    public Klass(Integer classNum) {
        this.number = classNum;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }
}
