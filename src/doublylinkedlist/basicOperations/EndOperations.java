package doublylinkedlist.basicOperations;

public class EndOperations {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data; //can be any generic type
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
    public EndOperations(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; //or head == null
    }

    public void displayForward(){
        if(head == null)
            return;
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public static void main(String[] args) {
        EndOperations dll = new EndOperations();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.displayForward();
        dll.displayBackward();
    }
}
