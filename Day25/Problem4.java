package Day25;

public class Problem4 {
    public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) r = Math.max(r, p);

        while (l < r) {
            int m = (l + r) / 2;
            int hours = 0;
            for (int p : piles)
                hours += (p + m - 1) / m;

            if (hours <= h) r = m;
            else l = m + 1;
        }
        return l;
    }
}
}
