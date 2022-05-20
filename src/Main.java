import java.util.Scanner;

/*
Encapsulation 02
Exercise: Encapsulation 2
achieve encapsulation using Lombok for a class Person that has the following attributes:
name
surname
height (a double)
age
ask the user to input the values
then print all the details of the Person
when printing the height, use just 2 decimal places (e.g. the result could be 5.50)
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Type your name and hit enter");
        person.setName(scanner.next());
        System.out.println("Type your surname and hit enter");
        person.setSurname(scanner.next());
        System.out.println("Type your age and hit enter");
        person.setAge(scanner.nextInt());
        System.out.println("Type your height and hit enter");
        person.setHeight(scanner.nextDouble());

        System.out.println(person.toString());
    }
}
