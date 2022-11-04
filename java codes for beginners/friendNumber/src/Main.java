import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number1,number2;
        int sum1 = 0, sum2 = 0;

        System.out.println("Give the first number");
        number1 = scan.nextInt();

        System.out.println("Give the second number");
        number2 = scan.nextInt();

        for(int i = 1; i < number1-1 ; i++){
            if(number1 % i ==0){
                sum1 += i;
            }
        }

        for(int i = 1; i < number2 ; i++){
            if(number2 % i ==0){
                sum2 += i;
            }
        }

        if( sum1 == number2 && sum2 == number1 ){
            System.out.print("these are friend numbers");
        }
        else{
            System.out.print("these are not friend numbers");

        }

    }
}