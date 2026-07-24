package Day30;

import java.util.Arrays;

public class Problem7 {

    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1, j = 0, plat = 1, ans = 1;

        while (i < arr.length && j < dep.length) {

            if (arr[i] <= dep[j]) {
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }

            ans = Math.max(ans, plat);
        }

        System.out.println("Minimum Platforms = " + ans);
    }
}

