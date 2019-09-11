public class SwapNodesInPairs {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode swapPairs(ListNode head) {

        ListNode out = new ListNode(-1);
        if(head != null && head.next !=null)out = head.next;
        else return head;

        ListNode secondNode = null;
        while(head != null && head.next != null){
            ListNode thredNode = head.next.next;
            head.next.next = head;
            if(secondNode != null){
                secondNode.next = head.next;
            }
            head.next = thredNode;
            secondNode = head;
            head = thredNode;

        }
        return out;
    }
    public static void main(String[] args) {

    }
}
