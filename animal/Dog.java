package animal;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override public void say() {
        System.out.println("Woof");
    }
    public void cmt(String text) {
        super.comment();
        System.out.println(name + " says: Woof woof! " + text);
    }
}