// Java program to implement
// a Singly Linked List
class LinkedList {
    constructor() {
        this.head = null;
    }

    // Node class representing a node in the linked list
    static Node = class {
        constructor(d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    insert(data) {
        // Create a new node with the given data
        const newNode = new LinkedList.Node(data);

        // If the linked list is empty, set the new node as the head
        if (this.head === null) {
            this.head = newNode;
        } else {
            // Traverse to the last node and insert the new node there
            let last = this.head;
            while (last.next !== null) {
                last = last.next;
            }

            // Insert the new node at the last node
            last.next = newNode;
        }
    }

    // Method to print the linked list
    printList() {
        let current = this.head;

        console.log("Linked List:");
        while (current !== null) {
            console.log(current.data);
            current = current.next;
        }
    }
}

// Driver code
const list = new LinkedList();

// Insert values into the list
list.insert(1);
list.insert(2);
list.insert(3);
list.insert(4);

// Print the linked list
list.printList();
