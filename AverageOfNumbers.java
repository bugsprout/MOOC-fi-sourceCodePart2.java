import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 0){
                break;
            }
            if (givenNumber != 0){
                numbers = numbers + 1;
                sum = sum + givenNumber;
            }
        }
        System.out.println("Average of the numbers: " + (Double.valueOf((double) sum / (double) numbers)));
    }
}
