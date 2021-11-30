package singlylinkedlist.basicOperations;

public class PositionOperation {
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

    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void delete(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        PositionOperation sll = new PositionOperation();
        sll.insert(1,3);
        sll.insert(2,5);
        sll.insert(1,2);
        sll.insert(2,4);
        sll.insert(5,7);
        sll.display();
        sll.delete(1);
        sll.delete(3);
        sll.delete(3);
        sll.display();
    }
}
