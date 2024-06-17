// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Javascript program to implement
// a Singly Linked List
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
    insert(list, data) {
        // Create a new node with given data
        let tempNode = new LinkedList.Node();
        tempNode.data = data;
        tempNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if(this.head == null){
            this.head = tempNode;
            return;
        }
        // Else traverse till the last node
        // and insert the new_node there
        let curr = this.head;
        while(curr.next != null){
            curr = curr.next;            
        }

        // Insert the new_node at last node
        // Return the list by head
        curr.next = tempNode;
        return this.head;
    }

     // Method to print the LinkedList.
    printList(list) {
        // Traverse through the LinkedList
        let curr = this.head;
        while(curr != null){
            // Print the data at current node
            console.log(curr.data);
            // Go to next node
            curr = curr.next
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
        list.insert(list, 5);
        // Print the LinkedList
        list.printList(list);
