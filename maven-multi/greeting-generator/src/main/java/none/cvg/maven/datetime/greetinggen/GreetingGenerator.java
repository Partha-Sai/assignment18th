package none.cvg.maven.datetime.greetinggen;

import none.cvg.maven.greeting.Greeting;
import java.util.Scanner;

public class GreetingGenerator {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println("\n" + greeting.greet());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num2: ");
        int num2=sc.nextInt();
        int mul=num1*num2;
        System.out.println("The multiplied value is: "+mul);


    }
}
