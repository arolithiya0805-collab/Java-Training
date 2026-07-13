package Day14;

public class Problem11 {
    public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reverse: " + rev);
    }
}
    
}
