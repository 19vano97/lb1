package ua.math;

/**
 * Created by vanillin on 14.06.2017.
 */
public class App {
    public static void main(String[] args) {
        Human human=new Human();
        human.name="Ivan";
        System.out.println("Human's name: "+ human.name);
        System.out.println("Human's age: "+ human.age);
        System.out.println(human);
    }
}
