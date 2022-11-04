import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[] { 1, 2, 4, 7, 8, 10 };
        int search;
        boolean flag = false;

        System.out.println("Give a number");
        search = scan.nextInt();

        for (int number : numbers) {
            if (search == number) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("The number is available.");
        } else {
            System.out.println("The number is not available.");
        }
    }
}