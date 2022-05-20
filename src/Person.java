import lombok.Data;

import java.text.DecimalFormat;

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
@Data
public class Person {

    private String name;
    private String surname;
    private double height;
    private int age;

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + df.format(height)+ //String.format("%.2f",height) <- alternatively
                ", age=" + age +
                '}';
    }
}
