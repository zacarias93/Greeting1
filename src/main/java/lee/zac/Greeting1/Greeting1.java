package lee.zac.Greeting1;
import java.util.Scanner;
/**
 * Created by zaclee on 9/9/16.
 */
public class Greeting1 {

    String name;

    public String askName() {
        System.out.println("Hello, what is your name?");
        Scanner in = new Scanner(System.in);
        name = in.next();
        return name;
    }
    public void greeting() {

        askName();

        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name);
        }
        else {
            System.out.println("Hello");
        }
    }

        public static void main(String[] args) {
            Greeting1 greeting = new Greeting1();
            greeting.greeting();

        }
    }


