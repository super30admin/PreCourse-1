// Time Complexity: O(n) for insert and printList
// Space Complexity: O(n) for storing n nodes in the list

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
    };

    // Method to insert a new node
    insert(list, data) {
        const newNode = new LinkedList.Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head === null) {
            list.head = newNode;
            return list;
        }

        // Else traverse till the last node
        let current = list.head;
        while (current.next !== null) {
            current = current.next;
        }

        // Insert the new_node at last node
        current.next = newNode;

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    printList(list) {
        let current = list.head;

        // Traverse through the LinkedList
        while (current !== null) {
            // Print the data at current node
            process.stdout.write(String(current.data) + " ");

            // Go to next node
            current = current.next;
        }
        console.log();
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
