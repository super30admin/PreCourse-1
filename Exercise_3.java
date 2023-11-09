//Time Complexity : insert(): O(1), printList(): O(N)
//Space Complexity : O(N)
class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node node = new Node(data);
        if (list.head == null) {
            list.head = node;
        }
        else {
            Node newNode = list.head;
            while (newNode.next != null) {
                newNode = newNode.next;
            }
            newNode.next = node;
        }
        return list;
    }

    public static void printList(LinkedList list)
    {
        Node n = list.head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
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