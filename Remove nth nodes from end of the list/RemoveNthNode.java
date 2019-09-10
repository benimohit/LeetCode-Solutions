
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0 ) return head;

        ListNode p1 = new ListNode(-1);
        p1.next = head;
        ListNode out = p1;
        ListNode p2 = new ListNode(-1);
        p2.next = head;
        // Pass n nodes from one of the p1 or p2
        for(int i =0; i< n && p1.next!=null ; i++){
            p2 = p2.next;
        }
        while(p2.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        if(p1.next !=null && p1.next.next != null){
            p1.next = p1.next.next;}
        else if(p1.next.next == null){p1.next = null;}

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
