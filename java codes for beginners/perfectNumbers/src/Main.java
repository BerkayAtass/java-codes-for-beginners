import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Give a number");
        number = scan.nextInt();

        for(int i = 1; i < number ; i++){
            if(number%i ==0){
                sum += i;
            }
        }

        if( sum == number){
            System.out.print("it is a perfect number");
        }
        else{
            System.out.print("it is not a perfect number");

        }

    }
}