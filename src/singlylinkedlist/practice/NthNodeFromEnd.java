package singlylinkedlist.practice;

public class NthNodeFromEnd {
    private ListNode head;
    private static class ListNode {
        private int data; //generic type
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode getNthNodeFromEnd(int n){
        if(head == null)
            return null;
        if(n <= 0)
            throw new IllegalArgumentException("Invalid value: n = " + n);
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            if(refPtr == null)
                throw new IllegalArgumentException(n + "is greater than the number of nodes in the list");
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public static void main(String[] args) {
        NthNodeFromEnd sll = new NthNodeFromEnd();
        sll.insertFirst(11);
        sll.insertFirst(1);
        sll.insertFirst(5);
        sll.insertFirst(8);
        sll.insertFirst(10);
        sll.display();
        ListNode nthNode = sll.getNthNodeFromEnd(3);
        System.out.println("nth node from end is -> " + nthNode.data);
    }
}
