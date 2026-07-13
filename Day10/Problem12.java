package Day10;

public class Problem12 {
    public static void main(String[] args) {

        Inkjet i = new Inkjet();

        i.print();
    }
}

interface Printer {
    void print();
}

class Inkjet implements Printer {

    public void print() {
        System.out.println("Printing");
    }
}
