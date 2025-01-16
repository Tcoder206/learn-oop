package person;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(String food) {
        System.out.println(name + " dang an " + food);
    }
    public void getAge() {
        System.out.println(age);
    }
}
