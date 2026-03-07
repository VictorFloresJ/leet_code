class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current = new ListNode();
        ListNode head = new ListNode();
        head.next = current;

        while (list1 != null) {
            if (list2 == null) {
                current.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return head.next.next;
    }

    public void main(String[] args) {
        // Input data
        int[] arr1 = { 1, 4 , 5, 6 , 9};
        int[] arr2 = { 3};

        // Construction
        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);

        ListNode head = mergeTwoLists(list1, list2);

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
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
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
