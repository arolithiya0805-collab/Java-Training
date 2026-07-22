package Day25;

public class Problem10 {
    class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0), cur = d;
        int c = 0;
        while (l1 != null || l2 != null || c != 0) {
            int sum = c;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }
            cur.next = new ListNode(sum % 10);
            c = sum / 10;
            cur = cur.next;
        }
        return d.next;
    }
}
}
