import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        TestDog d1 = new Dog("Mike", 2);
        TestDog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}