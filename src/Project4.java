//Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
//public static String convertMillis(long millis)
//The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns the string 0:0:5, convertMillis(100000) returns the string 0:1:40, and convertMillis(555550000) returns the string 154:19:10.
//Write a test program that prompts the user to enter a value for milliseconds and displays a string in the format of hours:minutes:seconds.
//
//        Sample Run
//Enter time in milliseconds: 555550000
//        154:19:10
//

import java.util.Scanner;

public class Project4 {
    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt user to enter a value for milliseconds
        System.out.print("Enter time in milliseconds: ");
        long millis = input.nextLong();

        String result = convertMillis(millis);
        System.out.println(result);


    }
    public static String convertMillis ( long millis){
            //convert milliseconds to total seconds
        long totalSeconds = millis / 1000;
            //calculate hours using total seconds
        long hours = totalSeconds / 3600;
            //calculate remaining seconds after hours
        long remainingSeconds = totalSeconds % 3600;
            //calculate minutes from remaining seconds
        long minutes = remainingSeconds / 60;
            //calculate remaining seconds after minutes
        long seconds = remainingSeconds % 60;
            //return string formatted as hours:minutes:seconds
        return hours + ":" + minutes + ":" + seconds;

    }
}
