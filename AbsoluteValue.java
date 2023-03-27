import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int given = Integer.valueOf(scanner.nextLine());
        if (given < 0){
            System.out.println(given * -1);
        } else {
            System.out.println(given);
        }

    }
}
