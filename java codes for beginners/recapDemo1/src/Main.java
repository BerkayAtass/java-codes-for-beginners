public class Main {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 =  5;
        int number3 = 6;

        if(number1==number2 & number1==number3 && number2==number3) {
            System.out.println("All numbers are equal.");


        }else if(number1>number2 & number1>number3) {
            System.out.println("Number 1 is greatest");


        }else if(number2>number1 & number2>number3) {
            System.out.println("Number 2 is greatest");

        }else {
            System.out.println("Number 3 is greatest");

        } if(number1==number3) {
            System.out.println("Number 1 and number 3 are equal");

        }else if (number1==number2) {
            System.out.println("Number 1 and number 2 are equal");


        } else if(number2==number3) {
            System.out.println("Number 2 and number 3 are equal");
        }
    }
}
