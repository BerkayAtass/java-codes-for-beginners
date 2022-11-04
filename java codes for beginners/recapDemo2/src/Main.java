public class Main {
    public static void main(String[] args) {

        Double[] myList = {5.6, 10.2, 18.34, 18.42, 11.27};
        double max = myList[0];
        double sum = 0;

        for (Double aDouble : myList) {
            sum += aDouble;
            max = max < aDouble ? aDouble : max;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Greatest number is " + max);
    }
}