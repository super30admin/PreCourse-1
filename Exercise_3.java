/*
Time Complexity: for adding an element is O(n) since we are adding element in the end here
*/
//implement a SLL
public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static LinkedList insert(LinkedList list, int data){
        Node node = new Node(data);

        if(list.head == null)
            list.head = node;
        else{
            Node cur = list.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
        return list;
    }


    static void printList(LinkedList list){
        Node cur = list.head;

        while(cur!=null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);

        printList(list);

    }
}
