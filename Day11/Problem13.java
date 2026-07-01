package Day11;

public class Problem13 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {

            public void run() {
                System.out.println("Run");
            }
        };

        r.run();
    }
}