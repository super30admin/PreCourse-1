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

    insert(data) {
        const newNode = new LinkedList.Node(data);
        if (this.head === null) {
            this.head = newNode;
        } else {
            let lastNode = this.head;
            while (lastNode.next !== null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return this.head;
    }

    printList() {
        let currentNode = this.head;
        while (currentNode !== null) {
            console.log(currentNode.data);
            currentNode = currentNode.next;
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
