package animal;
public abstract class Animal{
    static int cnt = 0;
    public abstract void say();
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void favFood(String foodName) {
        System.out.println("My favourite food");
    }
    public void comment() {
        cnt++;
        System.out.println("(New comment!)");
        System.out.println("Comments count: " + cnt);
    }
}