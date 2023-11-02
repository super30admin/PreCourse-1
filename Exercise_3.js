// JavaScript program to implement a Singly Linked List
//the time complexity is O(n) and space is also O(n)
// time complexity is O(1) and space complexity is O(n), n is the number of elements in the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I wasn't fully aware of the topic however i used youtube 
//to learn and write the code
// Your code here along with comments explaining your approach

class LinkedList {
    constructor() {
        this.head = null;
    }
  
    // Linked list Node.
    static Node = class {
        constructor(d) {
            this.data = d;
            this.next = null;
        }
    }
  
    // Method to insert a new node
    insert(data) {
        // Create a new node with given data
        let newNode = new LinkedList.Node(data);
  
        // If the Linked List is empty, make the new node as the head
        if (this.head === null) {
            this.head = newNode;
        } else {
            // Else, traverse till the last node and insert the new_node there
            let current = this.head;
            while (current.next !== null) {
                current = current.next;
            }
  
            // Insert the new_node at the last node
            current.next = newNode;
        }
    }
  
    // Method to print the LinkedList.
    printList() {
              let current = this.head;
  
        // Traverse through the LinkedList
        while (current !== null) {
            // Print the data at the current node
            console.log(current.data);
            
            // Go to the next node
            current = current.next;
        }
    }
  }
  
  // Driver code
  /* Start with an empty list. */
  let list = new LinkedList();
  
  // ******INSERTION******
  // Insert the values
  list.insert(1);
  list.insert(2);
  list.insert(3);
  list.insert(4);
  
  // Print the LinkedList
  list.printList();
