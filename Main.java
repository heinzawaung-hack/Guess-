import java.util.Random;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int myNumber = random.nextInt(100);
        System.out.println("My Number " + myNumber);

        System.out.println("Enter a number");
        int guess =  scanner.nextInt();

        while (guess != myNumber){
            if (guess < myNumber){
                System.out.println("Your number is less than my number");
            }else {
                System.out.println("Your number is grater than my number");
            }
            guess = scanner.nextInt();
        }
        System.out.println("Your answer is correct.");
    }
}

