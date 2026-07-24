package Day30;

import java.util.Arrays;
import java.util.Comparator;

public class Problem6 {

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int d, int p) {
            this.id = id;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        Job[] jobs = {
                new Job('A', 2, 100),
                new Job('B', 1, 19),
                new Job('C', 2, 27),
                new Job('D', 1, 25),
                new Job('E', 3, 15)
        };

        Arrays.sort(jobs, Comparator.comparingInt((Job j) -> j.profit).reversed());

        boolean[] slot = new boolean[4];

        System.out.print("Selected Jobs: ");

        for (Job job : jobs) {
            for (int i = job.deadline; i > 0; i--) {
                if (!slot[i]) {
                    slot[i] = true;
                    System.out.print(job.id + " ");
                    break;
                }
            }
        }
    }
}
