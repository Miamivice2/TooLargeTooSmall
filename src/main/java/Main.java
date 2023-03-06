import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */




public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //writing prev number to store the data as the prev number
        Integer previous = -1;
        //wrote guesses to store the amount of guesses

        Integer guesses = 0;
        System.out.println("how many guesses? ");
        guesses = scan.nextInt();


        System.out.println("guess a number: ");

        //storing the input as a integer value
        Integer input = scan.nextInt();

        for(Integer i = 1; i <= guesses; i++) {
            if (i == guesses) {System.out.println("you are out of guesses");
                previous = -1;
                i--;
        }

            if (input < 40) {
                System.out.println("your input is less than the random number guess again: ");
                input = scan.nextInt();
                previous = input;

            } else if (input >40) {
                System.out.println("your input is greater than the random number guess again");
                input = scan.nextInt();
                previous = input;
            } else if (input == 40) {
                System.out.println("your input is equal to the random number");
                break;
            }
        }
    }
    }

