import animal.Dog;
import animal.Cat;
public class run{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.say();
        dog.sleep();
        dog.sleep("zzz...");

        Cat cat = new Cat();
        cat.say();
        cat.sleep();
    }
}