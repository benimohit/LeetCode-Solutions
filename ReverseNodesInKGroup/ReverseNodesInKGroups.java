public class ReverseNodesInKGroups {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null, next =head, current= head;
        for(int i = 0 ; i < k; i++, next = next.next){
            if(next == null) return head;
        }
        for(int i =0; i<k && current!=null; i++)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = reverseKGroup(current, k);
        return prev;
    }
}
