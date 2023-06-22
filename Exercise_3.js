"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LinkedList = exports.Node = void 0;
// Linked list Node. 
// This inner class is made static 
// so that main() can access it 
var Node = /** @class */ (function () {
    // Constructor 
    function Node(d) {
        this.data = d;
        this.next = null;
        //Write your code here 
    }
    return Node;
}());
exports.Node = Node;
// a Singly Linked List 
var LinkedList = /** @class */ (function () {
    // Method to insert a new node 
    function LinkedList() {
    }
    ;
    //return new LinkedList();
    LinkedList.insert = function (list, data) {
        // Create a new node with given data 
        var newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if (!list.head) {
            list.head = newNode;
        }
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            var current = list.head;
            while (current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
        return list;
        // Insert the new_node at last node 
        // Return the list by head 
    };
    // Method to print the LinkedList. 
    LinkedList.printList = function (list) {
        // Traverse through the LinkedList 
        var current = list.head;
        while (current.next) {
            // Print the data at current node 
            console.log(current.data);
            // Go to next node 
            current = current.next;
        }
    };
    return LinkedList;
}());
exports.LinkedList = LinkedList;
// Driver code 
/* Start with the empty list. */
var list = new LinkedList();
// 
// ******INSERTION****** 
// 
// Insert the values 
list = LinkedList.insert(list, 1);
list = LinkedList.insert(list, 2);
list = LinkedList.insert(list, 3);
list = LinkedList.insert(list, 4);
list = LinkedList.insert(list, 5);
// Print the LinkedList 
LinkedList.printList(list);
