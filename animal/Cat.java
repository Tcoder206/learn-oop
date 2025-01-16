package animal;

public class Cat extends Animal {
    public void say() {
        System.out.println("Meow meow!");
    }
    @Override
    public void sleep() {
        System.out.println("Meowwwww, no");
    }
}
