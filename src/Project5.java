import java.util.Scanner;

public class Project5 {

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // prompt user to enter the width
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        // call the format method
        String result = format(number, width);
        // display the formatted result
        System.out.println("The formatted number is " + result);
    }

    // Method to format the number with leading zeros
    public static String format(int number, int width) {
        // convert the integer to a String
        // determine the length of the number string
        // if the length is greater than or equal to width
        // return the original number string
        // otherwise
        // calculate how many zeros are needed
        // create a string containing the required number of leading zeros
        // concatenate the zeros and the original number string
        // return the formatted string
        return "";
    }
}
