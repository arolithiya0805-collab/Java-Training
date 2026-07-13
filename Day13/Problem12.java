package Day13;

public class Problem12 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        /*
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        } finally {
            System.out.println("Default");
        }
        */

        int[] arr = {1, 2, 3, 4, 5};
        String str = null;

        try {
            System.out.println(a / b);
            System.out.println(arr[2]);
            System.out.println(str.charAt(2));
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Unknown Exception");
        }

        System.out.println("Thank You");
    }
}