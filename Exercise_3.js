// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

// Java program to implement
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

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head === null){
            let newNode = new LinkedList.Node(data);
            list.head = newNode;
            return list;
        }

        // Else traverse till the last node
        // and insert the new_node there
        let node= list.head;
        while(node.next !== null)
        {
            node = node.next;
        }
        let latestNode = new LinkedList.Node(data);
        node.next = latestNode;

        return list;

        // Insert the new_node at last node
        // Return the list by head
    }

     // Method to print the LinkedList.
    printList(list) {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        let node = list.head;
        while(node.next !== null){
            console.log(node.data);
            node = node.next;
        }
        console.log(node.data);
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
