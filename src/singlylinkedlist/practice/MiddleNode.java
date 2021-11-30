package singlylinkedlist.practice;

public class MiddleNode {
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

    public ListNode getMiddleNode() {
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        MiddleNode sll = new MiddleNode();
        sll.insertFirst(11);
        sll.insertFirst(1);
        sll.insertFirst(5);
        sll.insertFirst(8);
        sll.insertFirst(10);
        sll.display();
        ListNode middleNode = sll.getMiddleNode();
        System.out.println("Middle Node is -> " + middleNode.data);
    }
}
