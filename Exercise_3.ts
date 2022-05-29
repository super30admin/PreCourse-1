
// Linked list Node. 
// This inner class is made static 
// so that main() can access it 
class ListNode {

    data: number;
    next: ListNode;
}
// Java program to implement 
// a Singly Linked List 
class LinkedList {

    head: ListNode; // head of list 
    

    // Method to insert a new node 
    insert(list, data: number) {
        // Create a new node with given data 
        const newNode = new ListNode();
        newNode.data = data;
        newNode.next = null;


        // If the Linked List is empty, 
        // then make the new node as head 
        if(!this.head){
            this.head = newNode;
        }

        // Else traverse till the last node 
        // and insert the new_node there 

        else{
            let temp = this.head;
            while(list.next !== null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Insert the new_node at last node 
        // Return the list by head 
        return this;

    }

    // Method to print the LinkedList. 
    printList(list: LinkedList) {
        // Traverse through the LinkedList 
        let current = list.head;
        while (current !== null) {
            // Print the data at current node 
            console.log(current.data);
            // Go to next node 
            current = current.next;
        }
    }
}

// Driver code 
class mainLinkedList {
    /* Start with the empty list. */
    list = new LinkedList();

    // 
    // ******INSERTION****** 
    // 

    // Insert the values
    constructor() {
        this.list.insert(this.list, 1);
        this.list.insert(this.list, 2);
        this.list.insert(this.list, 3);
        this.list.insert(this.list, 4);
        this.list.insert(this.list, 5);

        // Print the LinkedList 
        this.list.printList(this.list);
    }
} 
