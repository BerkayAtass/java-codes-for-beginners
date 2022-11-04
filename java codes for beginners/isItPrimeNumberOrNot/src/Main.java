import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Give a number");
        number = scan.nextInt();
        int flag = 1;

        if ( number == 0 || number == 1){
            System.out.println("is not a prime number.");
        }
        else if(number % 2 == 0){
            System.out.print("is not a prime number");
        }
        else{
            for(int temp = 2 ; temp < number ; temp++){
                if(number % temp == 0){
                    System.out.print("is not a prime number");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.print("it is a prime number");

            }
        }


    }
}