public boolean isPalindrome(ListNode head) {
    Deque<Integer> deque = new LinkedList<>();
    ListNode node = head;

    deque.add(node.val);

    while (node.next != null) {
        node = node.next;
        deque.add(node.val);
    }

    while (!deque.isEmpty() && deque.size() > 1) {
        if (deque.pollFirst() != deque.pollLast()) {
            return false;
        }
    }
    return true;
}

void main() {
}