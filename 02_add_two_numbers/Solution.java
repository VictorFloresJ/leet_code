class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummy = head;


        return head;
    }

    public ListNode buildList(int[] values) {
        if (values.length == 0)
            return null;
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public void main(String[] args) {
        // Input data
        int[] arr1 = { 9,9,9,9,9,9,9};
        int[] arr2 = { 9,9,9,9 };

        // Construction
        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);

        ListNode head = addTwoNumbers(list1, list2);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    };

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}