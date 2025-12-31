//
//  SinglyLinkedList.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 12/17/25.
//

class SinglyLLNode<T> {
    var value: T
    var next: SinglyLLNode<T>?
    
    init(value: T, next: SinglyLLNode<T>?) {
        self.value = value
        self.next = next
    }
}

class SinglyLinkedList<T> {
    
    private var head: SinglyLLNode<T>?
    private var tail: SinglyLLNode<T>?
    
    public init() {

    }
    
    public var isEmpty: Bool {
        return head == nil
    }
    
    //adds a new node at the fron tof the list O(1) operation
    public func push(_ value: T) {
        head = SinglyLLNode(value: value, next: head)
        if tail == nil {
            tail = head
        }
    }
    
    //Adds a new node at the end of the list with O(1) operation if tail reference is kept
    func append(value: T) {
        guard !isEmpty else {
            push(value)
            return
        }
        //the current tail's next pointer is set to the new node
        tail?.next = SinglyLLNode(value: value, next: nil)
        //the new node becomes the new tail
        tail = tail?.next
    }
        
    public func displayList() {
        var currentHead = head
        while currentHead != nil {
            print("\(currentHead!.value) -> ")
            currentHead = currentHead?.next
        }
    }
    
    public func currentHead() -> SinglyLLNode<T>? {
        return self.head
    }
}

class SinglyLinkedListImpl {
    init() {
        let linkedlist = SinglyLinkedList<Int>()
        linkedlist.append(value: 1)
        linkedlist.append(value: 2)
        linkedlist.push(30)
        print("Linked list contents:")
        linkedlist.displayList()
    }
}
