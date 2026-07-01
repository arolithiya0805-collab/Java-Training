package Day10;

public class Problem11 {
    public static void main(String[] args) {
        Sum.add(10, 20, 30);
    }
}
class Sum {
    static void add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println(sum);
    }
}
