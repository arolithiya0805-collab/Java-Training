package Day25;

public class Problem15 {
    class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode cur = d;
        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return d.next;
    }
}
}
