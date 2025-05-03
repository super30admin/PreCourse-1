//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file​
// Time Complexity: Add time complexity for each operation
// Space Complexity: Add space complexity for the data structure

class LinkedList {
    constructor() {
        this.head = null;
    }

    static Node = class {
        constructor(data) {
            this.data = data;
            this.next = null;
        }
    }

    insert(list, data) {
        // Create a new node with given data
        // If the Linked List is empty, make the new node as head
        // Otherwise, add the node at the end
        // Write your code here
    }

    printList(list) {
        // Traverse through the LinkedList and print each node
        // Write your code here
    }
}

// Driver code
const list = new LinkedList();

// Insert the values
list.insert(list, 1);
list.insert(list, 2);
list.insert(list, 3);
list.insert(list, 4);

// Print the LinkedList
list.printList(list);