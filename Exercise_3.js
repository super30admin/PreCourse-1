// Java program to implement
// a Singly Linked List

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
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
​
     //  Method to insert a new node
    insert(list, data) {
        // Create a new node with given data
       const newNode = new LinkedList.Node(data);
​
        // If the Linked List is empty,
        // then make the new node as head
        if(this.head === null) {
            this.head = newNode;
            return;
        }
        else{
        // Else traverse till the last node
        // and insert the new_node there
        let tempNode = this.head;
        while(tempNode.next!==null) {
            tempNode = tempNode.next;
        }
        // Insert the new_node at last node
        // Return the list by head
         tempNode.next = newNode;
         return this.head;
        }
        
    }
​
     // Method to print the LinkedList.
    printList(list) {
        // Traverse through the LinkedList
        if(this.head) {
            let tempNode = this.head;
            let output = "";
            while(tempNode != null) {
                // Print the data at current node
                output += tempNode.data +  "=>"
                 // Go to next node
                tempNode = tempNode.next;
            }
            console.log(output + "null")
        }
    }
}
       // Driver code
       /* Start with the empty list. */
       let list = new LinkedList();
​
        // ******INSERTION******
        // Insert the values
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        // Print the LinkedList
        list.printList(list);
