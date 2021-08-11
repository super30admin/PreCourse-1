class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    //Inserts value at the end
    push(val) {
        let newNode = new Node(val);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;

    }


    //     Removes element from the end
    pop() {
        if (!this.head) return undefined;
        let currentNode = this.head;
        let prevNode = currentNode;
        while (currentNode.next) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        this.tail = prevNode;
        this.tail.next = null;
        this.length--;
        if (this.length === 0) {
            this.head = null;
            this.tail = null;
        }
        return currentNode.val;
    }

    //     Find if the value exists in the list
    find(val) {
        if (!this.head) return null;

        let currentNode = this.head;
        while (currentNode) {
            if (currentNode.val === val) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }


    //     Print all the values in the list
    printList() {
        let currentNode = this.head;
        let list = [];
        while (currentNode) {
            list.push(currentNode.val);
            currentNode = currentNode.next;
        }

        return list;
    }


}

let ll = new LinkedList();
ll.push(10);
ll.push(20);
ll.push(30);
ll.printList();
ll.find(20);