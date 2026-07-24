package Day30;

import java.util.Arrays;
import java.util.Comparator;

public class Problem4 {

    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    public static void main(String[] args) {

        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;
        double profit = 0;

        Arrays.sort(items, Comparator.comparingDouble(a -> -(double) a.value / a.weight));

        for (Item i : items) {
            if (capacity >= i.weight) {
                profit += i.value;
                capacity -= i.weight;
            } else {
                profit += (double) i.value * capacity / i.weight;
                break;
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}