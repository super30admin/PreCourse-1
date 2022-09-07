// Time Complexity :
// Insert: O(N), where N is linked list length

// Space Complexity :
// Insert: O(N), where N is linked list length

// Did this code successfully run on Leetcode : Ran successfully locally. Did not find on leetcode
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Exercise_3 : Implement Singly Linked List.

class ListNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor(head = null) {
        this.head = head;
    }
}

// Method to insert a new node 
LinkedList.prototype.insert = function (data) {

    // Create a new node with given data 
    let node = new ListNode(data);

    // If the Linked List is empty, 
    // then make the new node as head 
    if (this.head == null) {
        this.head = node;
    } else {
        // Else traverse till the last node 
        // and insert the new_node there 

        // Insert the new_node at last node 
        let dummyhead = this.head;
        while (dummyhead.next != null) {
            dummyhead = dummyhead.next;
        }
        dummyhead.next = node;
    }
}

// Method to print the LinkedList. 
LinkedList.prototype.printList = function () {
    // Traverse through the LinkedList 
    // Print the data at current node 
    // Go to next node 
    let dummyhead = this.head;
    while (dummyhead != null) {
        console.log(dummyhead.data);
        dummyhead = dummyhead.next;
    }
}

let list = new LinkedList();
list.insert(2);
list.insert(3);
list.insert(4);
list.insert(5);
list.printList();