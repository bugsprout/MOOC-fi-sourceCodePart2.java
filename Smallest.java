public class Smallest {

    public static int smallest(int number1, int number2) {
        int lesser = 0;
        if (number1 < number2) {
            lesser = number1;
        } else {
            lesser = number2;
        }
        return lesser;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
