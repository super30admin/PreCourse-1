// Java program to implement
// a Singly Linked List
//TC: insert : 0(n); print: O(n)
// SC: O(n) - n is the length of the linked list
//  Node.
class Node {
  constructor(d) {
    this.data = d;
    this.next = null;
  }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

     // Method to insert a new node
     insert(list, data) {
        // Create a new node with given data
        const newNode = new Node(data);



        // If the Linked List is empty,
        // then make the new node as head
        if (list.head === null) {
          list.head = newNode;
        } else {
          // Else traverse till the last node
          // and insert the new_node there
          let currHead = list.head;
          while (currHead.next !== null) {
            currHead = currHead.next
          }
          // Insert the new_node at last node
          currHead.next = newNode
        }

        // Return the list by head
       return list;
    }

     // Method to print the LinkedList.
     printList(list) {
       let currHead = list.head
        // Traverse through the LinkedList
       while(currHead !== null) {
         // Print the data at current node
         console.log(currHead.data);
         // Go to next node
         currHead = currHead.next;
       }
    }
}
// Driver code
/* Start with the empty list. */
let list = new LinkedList();

// ******INSERTION******
// Insert the values
list.insert(list, 1);
list.insert(list, 2);
list.insert(list, 3);
list.insert(list, 4);
// Print the LinkedList
list.printList(list);
