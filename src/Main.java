import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String trash = "";
        double input = 0;
        double Fahrenheit = 0;

        System.out.print("Enter your temperature in celsius: ");

        if (in.hasNextDouble()) {
            input = in.nextDouble();
            in.nextLine();
            Fahrenheit = (input * 1.8) + 32;

            System.out.println("Your temperature is " + Fahrenheit);

            if (Fahrenheit >= 212)
                System.out.println("Your temperature has reached a boiling point!");
            if (Fahrenheit <= 32)
                System.out.println("Your temperature has reached a freezing point!");
        } else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number!");

        }
    }
}
