import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int given = Integer.valueOf(scanner.nextLine());
        int givenSquared = (given * given);
        System.out.println(givenSquared);
    }
}
