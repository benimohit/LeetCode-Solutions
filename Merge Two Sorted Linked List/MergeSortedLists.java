public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode out = new ListNode(-1);
        ListNode current = out;
        while(l1!= null && l2!= null){
            ListNode temp = l1.val<l2.val ? l1:l2;
            current.next = temp;
            current = current.next;
            if(temp == l1) l1 = l1.next;
            else if(temp == l2)l2 = l2.next;
            current.next = null;
        }
        if(l1 == null){
            current.next = l2;
        }
        if(l2 == null){
            current.next = l1;
        }
        return out.next;
    }

     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
}
