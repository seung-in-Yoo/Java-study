package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dagName, int age) {
        this.dogName = dagName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
