import org.w3c.dom.ls.LSInput;

public class AddTwoNumbers {
   //Definition for singly-linked list.
    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode out = new ListNode(0);
            ListNode head = out;

            while(l1 != null || l2 != null || carry >0){
                int sum = 0;
                if(l1 != null){
                    sum += l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                sum += carry;

                if(sum > 9){
                    int put = sum % 10;
                    carry = sum /10;
                    ListNode out1 = new ListNode(put);
                    out.next = out1;
                    out = out1;
                }
                else{
                    carry = 0;
                    ListNode out1 = new ListNode(sum);
                    out.next = out1;
                    out = out1;
                }

            }
            return head.next;
        }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        addTwoNumbers(l1,l2);


    }
}
