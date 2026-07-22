package Day25;

class VersionControl {
    private int bad = 4;

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class Problem2 extends VersionControl {

    public int firstBadVersion(int n) {
        int l = 1, r = n;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (isBadVersion(m))
                r = m;
            else
                l = m + 1;
        }

        return l;
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        System.out.println(obj.firstBadVersion(5));
    }
}