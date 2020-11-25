package practice06;

public class Klass {
    public Integer getNumber() {
        return number;
    }

    final Integer number;

    public Klass(Integer classNum) {
        this.number = classNum;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }
}
