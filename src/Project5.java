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
        String numberString = Integer.toString(number);
        // if the number's length is greater than or equal to width
        if (numberString.length() >= width) {
            return numberString;
        }
        // otherwise, calculate how many zeros are needed
        int zerosNeeded = width - numberString.length();
        // build a string of leading zeros
        String zeroString = "";
        for (int i = 0; i < zerosNeeded; i++) {
            zeroString += "0";
        }
        // return zeros + original number
        return zeroString + numberString;
    }
    }
