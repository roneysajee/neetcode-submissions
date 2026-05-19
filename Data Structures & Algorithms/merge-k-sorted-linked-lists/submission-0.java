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
    ListNode mergeHead;
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        mergeHead = new ListNode();
        mergeHead.next = lists[0];
        for(int i =1;i< lists.length;i++){
            mergeTwoLists(mergeHead.next,lists[i]);
        }
        return mergeHead.next;
    }

    public void mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Loop until one of the lists becomes empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;  // Link to list1 node
                list1 = list1.next; // Move list1 pointer
            } else {
                tail.next = list2;  // Link to list2 node
                list2 = list2.next; // Move list2 pointer
            }
            tail = tail.next;       // Move tail pointer forward
        }

        // If any nodes remain in either list, append them directly
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        mergeHead.next = dummy.next;
    }
}
