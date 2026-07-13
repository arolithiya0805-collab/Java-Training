package Day13;

public class Problem12 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int[] arr = {1, 2, 3, 4, 5};
        String str = "Hello";

        try {
            System.out.println(a / b);
            System.out.println(arr[2]);
            System.out.println(str.charAt(2));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("Unknown Exception");
        }

        System.out.println("Thank You");
    }
}