import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            }
            if (number > 0){
                count = count + 1;
                sum = sum + number;
            }
        }
        if (sum <= 0){
            System.out.println("The average cannot be calculated");
        } else {
            System.out.println(Double.valueOf((double) sum / (double) count));
        }
    }
}
