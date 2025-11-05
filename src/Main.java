import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] options = {"Rock", "Paper", "Scissors"};

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter option: Rock:0, Paper:1, Scissors:2");

        int option1=-1;

        while (option1 < 0 || 2 < option1 ) {
            try {
                option1 = myObj.nextInt();
            }
            catch(Exception e) {
                myObj.nextLine();
                System.out.println("Please enter an Integer");
                continue;
            }
            if (option1 < 0 || 2 < option1 ) {
                System.out.println("Incorrect option");
            }

        }

        int option2 = (int)(Math.random() * 3);
        System.out.printf("%s (You) vs. %s%n", options[option1], options[option2]);

        if (option1 == option2) {
            System.out.println("Draw!");
        }
        else if (option1 == (option2+1)%3 ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Lose!");
        }

    }
}