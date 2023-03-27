import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 0) {
                break;
            }
            if (givenNumber != 0) {
                sum = sum + givenNumber;
                number = (number + 1);
            }
        }
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: " + sum);
    }
}
