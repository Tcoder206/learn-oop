package animal;
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override public void say() {
        System.out.println("Meow");
    }
    public void cmt(String text) {
        super.comment();
        System.out.println(name + " says: Meowww! " + text);
    }
}