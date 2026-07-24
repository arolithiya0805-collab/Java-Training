package Day30;

public class Problem3 {
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int count = 1;
        int last = 0;

        System.out.println("Selected Activities:");
        System.out.print(last + " ");

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= end[last]) {
                System.out.print(i + " ");
                count++;
                last = i;
            }
        }

        System.out.println("\nTotal Activities = " + count);
    }
}