package DataStructure.LinkedList;

/**
 * 
 * LInkedListed
 * operation;
 * 1. create list as constructor -- done
 * 2. addNode -- ongoing
 * 3. insertAtIndex
 * 4. removeAtIndex
 * 5. displayAtIndex
 * 6. displayWholeList
 * 
 */
public class LinkedList {

    // node structure
    class Node{
        int data = 0;
        Node next = null;
    }

    public Node start = null;

    public LinkedList(){
        Node node = new Node();
        node.data = 0;
        node.next = null; 
        this.start = node;
    }

    public void addNode(int data){
        
    }

}