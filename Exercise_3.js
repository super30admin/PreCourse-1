// JS program to implement
// a Singly Linked List
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Not tested on leetcode
// Any problem you faced while coding this : No
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
        let newNode = new LinkedList.Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null)
            list.head = newNode;
        // Else traverse till the last node
        // and insert the new_node there
        else{
            let node = list.head;
            while(node.next != null )
                node = node.next;
            node.next = newNode;
        }

        // Insert the new_node at last node
        // Return the list by head
        console.log(`${data} inserted to the list`);
        return list.head;
    }

     // Method to print the LinkedList.
    printList(list) {
        if(list.head == null)
            console.log('Empty list')
         // Traverse through the LinkedList
        // Print the data at current node
         // Go to next node
        else {
            let node = list.head
            while(node.next != null ){
                console.log(node.data);
                node = node.next;
            }
            console.log(node.data);
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
