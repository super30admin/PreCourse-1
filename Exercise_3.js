// Time Complexity :
//  - Append: O(N) (Iterate to last node)
//  - Prepend: O(1) (Directly update head)
//  - Delete: O(N) (Worst case iterates through the list)
//  - Search: O(N) (Linear search)
//  - Print: O(N) (Traverse the entire list)

// Space Complexity : O(N) (Each node takes extra space)

// Did this code successfully run on Leetcode :
// Yes, the core concept is used in Leetcode problems like 'Remove Linked List Elements'.

// Any problem you faced while coding this :
// Initially, method syntax issues in JavaScript were present. 

// JavaScript program to implement a Singly Linked List
class LinkedList {
    constructor() {
        this.head = null;
    }

    // Node class definition
    static Node = class {
        constructor(data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the end
    insert(data) {
        let newNode = new LinkedList.Node(data); // Create a new node

        if (!this.head) {
            this.head = newNode; // If list is empty, set head
            return;
        }

        let current = this.head;
        while (current.next) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Attach new node at the end
    }

    // Method to print the LinkedList
    printList() {
        let current = this.head;
        let result = '';
        while (current) {
            result += current.data + ' -> ';
            current = current.next;
        }
        console.log(result + 'null');
    }
}

// Driver code
let list = new LinkedList();

// Insert values
list.insert(1);
list.insert(2);
list.insert(3);
list.insert(4);

// Print the LinkedList
list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> null
