import java.io.*; 

public class LinkedList { 
   Node head;
    
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
           data = d; 
           next = null;
        } 
    } 
  
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node x = new Node(data);
        if (list.head == null) {
            list.head = x;
        }
        else {
            Node y = list.head;
            while (y.next != null) {
                y = y.next;
            }
            y.next = x;
        }
        return list;
    }
    public static void printList(LinkedList list) 
    {
        Node node = list.head;
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5);
        printList(list); 
    } 
}
