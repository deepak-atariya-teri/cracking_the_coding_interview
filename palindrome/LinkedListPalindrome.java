package palindrome;

/**
 * LinkedListPalindrome
 */
public class LinkedListPalindrome {
    
    private Node head = null;
    class Node{
        int data = 0;
        Node next = null;
    }

    private LinkedListPalindrome(int someValue){
        this.head = new Node();
        this.head.data = someValue;
    }
    
    public void addFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = this.head;
        this.head = node;
    }
    
    public void addLast(int data){
        Node node = new Node();
        node.data = data;
        Node temp = this.head;
        while(this.head.next!=null){
            this.head = this.head.next;
        }
        
        this.head.next = node;
        this.head = temp;

    }

    public void show(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public void palindrome(){
        

    }
    
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.palindrome();
        
        list.show();
    }

}