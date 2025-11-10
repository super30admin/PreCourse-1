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
​
     // Method to insert a new node
    insert(list, data) {
        // Create a new node with given data

        const node = new LinkedList.Node(data);
​
        // If the Linked List is empty,
        // then make the new node as head

        if(!list.head){
            list.head = node;
            return;
        }
​
        // Else traverse till the last node
        // and insert the new_node there

        let head = list.head;
        while(head && head.next){
            head = head.next;
        }
        head.next = node;
​
        // Insert the new_node at last node
        // Return the list by head

        let dummy = list.head;
        let currHead = list.head;
        while(currHead && currHead.next){
            currHead = currHead.next;
        }
        head.next = node;
        return dummy;
    }
​
     // Method to print the LinkedList.
    printList(list) {
        // Traverse through the LinkedList

        let currNode = list.head;
        while(currNode){
            console.log(currNode.data);
            currNode = currNode.next;
        }
​
        // Print the data at current node
​
        // Go to next node
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
