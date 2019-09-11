public class MergeKSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        //edge case []
        if (lists.length == 0) return null;
        return partition(lists, 0, lists.length-1);
    }

    public ListNode partition(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];

        // start will always be less than or equal to end
        int mid = (start + end) / 2;
        ListNode l1 = partition(lists, start, mid);
        ListNode l2 = partition(lists, mid+1, end);
        return mergeTwo(l1, l2);
    }

    public ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode out1 = new ListNode(-1);
        ListNode out = out1;
        while(l1 != null & l2 != null){
            if(l1.val <= l2.val){
                out.next = l1;
                out = out.next;

                l1 = l1.next;
                out.next = null;
            }
            else{
                out.next = l2;
                out = out.next;

                l2 = l2.next;
                out.next = null;
            }


        }
        if(l1 == null){
            out.next = l2;
        }
        if(l2 == null)out.next = l1;
        return out1.next;


    }
    public static void main(String[] args) {

    }
}
