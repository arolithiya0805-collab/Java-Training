package Day11;

public class Problem11 {
    public static void main(String[] args) {

        Bank b = new Bank();

        System.out.println(b.getBalance());
    }
}

class Bank {
    private int balance = 5000;

    int getBalance() {
        return balance;
    }
}
