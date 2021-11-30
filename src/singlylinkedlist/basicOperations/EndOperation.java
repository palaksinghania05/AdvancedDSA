package singlylinkedlist.basicOperations;

public class EndOperation {
    private ListNode head;
    private static class ListNode {
        private int data; //generic type
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null)
            return 0;
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    //insert a node at the end of a linked list
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    //delete a node from the end of a linked list
    public ListNode deleteLast() {
        if(head==null || head.next == null)
            return head;
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static void main(String[] args) {
        EndOperation sll = new EndOperation();
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(10);
        sll.display();
        System.out.println(sll.deleteLast().data);
        System.out.println(sll.deleteLast().data);
        sll.display();
    }
}
