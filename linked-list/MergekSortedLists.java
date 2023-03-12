/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (lists == null || n == 0) return null;

        // Ensure our pq takes in ListNodes and compares their values.
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode a, ListNode b) -> a.val - b.val);

        // Add the head of all non-null lists to the pq to begin.
        for (ListNode list: lists)
            if (list != null) pq.add(list);

        // Dummy node pointer to help add to our output list.
        ListNode ptr = new ListNode(-1);
        ListNode head = ptr;

        // 1) Get the smallest node from the PriorityQueue.
        // 2) Add it to our output list.
        // 3) Add the next node of the current list to the pq if it's not null
        // 4) Repeat
        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            ptr.next = new ListNode(curr.val);
            ptr = ptr.next;
            if (curr.next != null) pq.add(curr.next);
        }

        return head.next;
    }
}