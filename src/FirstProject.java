import java.util.Scanner;
public class FirstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*final double POUND = 0.45359237;
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

         */
        //Prompting the user to enter the character
        System.out.print("Enter a SINGLE letter: ");

        //Accepting user input
        String user_letter = input.nextLine();

        //Ensure use input is in right form
        user_letter = user_letter.toLowerCase();


        //Using switch cases to return corresponding number of letter
        switch (user_letter) {
            case "a", "b", "c" :
                System.out.print('2');
                break;
            case "d", "e", "f" :
                System.out.print('3');
                break;
            case "g", "h", "i" :
                System.out.print('4');
                break;
            case "j", "k", "l" :
                System.out.print('5');
                break;
            case "m", "n", "o" :
                System.out.print('6');
                break;
            case "p", "q", "r", "s":
                System.out.print('7');
                break;
            case "t", "u", "v" :
                System.out.print('8');
                break;
            case "w", "x", "y" , "z" :
                System.out.print('9');
                break;
            default:
                System.out.println("Invalid letter");

            //Closing Scanner
            input.close();
        }




    }

}
