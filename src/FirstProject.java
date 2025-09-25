import java.util.Scanner;
public class FirstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double POUND = 0.45359237;
        final double INCH = 0.0254;

        System.out.println("Enter your height in inches: ");
       double user_Height =  input.nextDouble();

        System.out.println("Enter your weight in pounds: ");
        double user_Weight = input.nextDouble();

        double weight_kg = user_Weight * POUND;
        double height_m = user_Height * INCH;

        double BodyMassIndex = weight_kg/(height_m*height_m);
        System.out.println("Your BMI is:  " + BodyMassIndex);

        input.close();





    }

}
