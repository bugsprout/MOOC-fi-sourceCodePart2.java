import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            // input
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += number;
            count++;
            continue;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (Double.valueOf((double) sum / count)));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
