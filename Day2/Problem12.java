package Day2;

public class Problem12 {
    public static void main(String[] args) {
        int a = 10, b = 20, t;
        t = a; a = b; b = t;
        System.out.println(a + " " + b);
    }
}
