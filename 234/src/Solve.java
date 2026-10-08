import java.util.List;
import java.util.Stack;

public class Solve {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        List<Integer> stack = new Stack<>();

        stack.add(cur.val);

        while (cur.next != null) {
            cur = cur.next;
            stack.add(cur.val);
        }

        ListNode node = head;
        while (!stack.isEmpty()) {
            if (node.val != stack.getLast()) break;
            stack.removeLast();
            node = node.next;
        }

        return stack.isEmpty();
    }
}
