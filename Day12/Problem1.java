package Day12;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("true");
        } 
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("false");
        }
    sc.close();
    }
}