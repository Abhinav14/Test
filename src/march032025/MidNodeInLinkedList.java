package march032025;


public class MidNodeInLinkedList {
    public static Integer findMiddleElement(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);

        Integer middleElement = findMiddleElement(head);

        if(middleElement != null){
            System.out.println(middleElement);
        }else{
            System.out.println("Empty LL");
        }
    }
}
