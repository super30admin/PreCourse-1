// Time Complexity : inset O(N), print O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


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

    isEmpty(list) {
        return list.head === null
    }

     // Method to insert a new node
    insert(list, data) {
        // Create a new node with given data
        const newNode = new LinkedList.Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if(this.isEmpty(list)) {
            list.head = newNode;
        }else {
            let tail = list.head;
            while(tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }

        return list.head;
    }

     // Method to print the LinkedList.
     printList(list) {
        // Traverse through the LinkedList
        let temp = list.head;
        while(temp != null) {
            console.log(temp.data + " ");
            temp = temp.next; 
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
