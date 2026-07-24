package Day30;

public class Problem10 {

    static void printFraction(int num, int den) {

        while (num != 0) {

            int x = (den + num - 1) / num;

            System.out.print("1/" + x + " ");

            num = num * x - den;
            den = den * x;
        }
    }

    public static void main(String[] args) {

        printFraction(6, 14);
    }
}