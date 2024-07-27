// Java program to implement
// a Singly Linked List
class LinkedList {
    // Time complexity: O(1)
    // Space complexity: O(1)
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

    // Time complexity: O(n)
    // Space complexity: O(1)
     // Method to insert a new node
    insert(list, data) {
        // Create a new node with given data
        const n1 = new Node(data)
        // If the Linked List is empty,
        // then make the new node as head​
        if(list.head === null){
            list.head = n1;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else {
         let last = list.head;
         while(last.next !== null){
            last = last.next;
         }   
          // Insert the new_node at last node
            last.next = n1;
        }
        // Return the list by head
        return list;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    // Method to print the LinkedList.
    printList(list) {
        let curr = list.head;
        // Traverse through the LinkedList
        while(curr !== null){
            // Print the data at current node
            console.log(curr.data);
            // Go to next node
            curr = curr.next;
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
