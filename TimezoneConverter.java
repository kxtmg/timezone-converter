import java.util.Scanner;

class TimezoneConverter{

    public static void main(String[] args){

        // Prompt
        System.out.println("Enter time (PDT): ");

        // Read in user input
        Scanner input = new Scanner(System.in);
        
        int userInput = input.nextInt(); // 12-hour
        String meridiem = input.nextLine(); // am or pm
        
        input.close();

        System.out.println(userInput + " . " + meridiem);

    }
}