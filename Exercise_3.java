//Time Complexity:
//Insertion: O(n)
//PrintList: O(n)
//Space Complexity: O(n)

public class Exercise_3 {

  Node head; // head of list

  static class Node {

    int data;
    Node next;

    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  public static Exercise_3 insert(Exercise_3 list, int data) {
    Node newNode = new Node(data);

    if (list.head == null) {
      list.head = newNode;
    } else {
      Node listHead = list.head;
      while (listHead.next != null) {
        listHead = listHead.next;
      }

      listHead.next = newNode;
    }

    return list;
  }

  public static void printList(Exercise_3 list) {
    Node listHead = list.head;

    if (listHead == null) {
      System.out.println("List is empty");
      return;
    }

    while (listHead != null) {
      System.out.print(listHead.data + " ");
      listHead = listHead.next;
    }
    System.out.println();
  }

  // Driver code
  public static void main(String[] args) {
    /* Start with the empty list. */
    Exercise_3 list = new Exercise_3();

    //
    // ******INSERTION******
    //

    // Insert the values
    list = insert(list, 1);
    list = insert(list, 2);
    list = insert(list, 3);
    list = insert(list, 4);
    list = insert(list, 5);

    // Print the LinkedList
    printList(list);
  }
}
