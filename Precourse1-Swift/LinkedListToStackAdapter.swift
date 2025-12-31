//
//  LinkedListToStackAdapter.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 12/16/25.
//

//Implement stack using linked list

class LLNode<T> {
    var value: T
    var next: LLNode<T>?
    
    init(value: T, next: LLNode<T>?) {
        self.value = value
        self.next = next
    }
}

class LLLinkedList<T> {
    private var head: LLNode<T>?
    private var tail: LLNode<T>?
    
    var isEmpty: Bool {
        return head == nil
    }
    
    var count: Int {
        var currentHead = head
        var count = 0
        while (currentHead != nil) {
            count += 1
            currentHead = currentHead?.next
        }
        return count
    }
    
    init() {
        
    }
}

extension LLLinkedList {
    func append(value: T) {
        let newNode = LLNode(value: value, next: nil)
        if head == nil {
            //means linkedlist is empty, so set the newnode as the head and tail both
            tail = newNode
            head = newNode
        } else {
            //if linked list is not empty then do normal appending
            tail?.next = newNode
            tail = newNode
        }
    }
    
    func prepend(value: T) {
        let newNode = LLNode(value: value, next: nil)
        if head == nil {
            //linked list is empty
            head = LLNode(value: value, next: nil)
            tail = head
        } else {
            // linked list is not empty
            newNode.next = head
            head = newNode
        }
    }
    
    func removeFirstNode() -> LLNode<T>? {
        if (head == nil) {
            //it means the ll is empty
            return nil
        } else {
            //if the ll is not empty
            let currentHead = head
            if let nextNode = head?.next {
                head = nextNode
            } else if (head?.next == nil) {
                head = nil
            }
            return currentHead
        }
    }
    
    var currentHead: LLNode<T>? {
        return head
    }
}

extension LLLinkedList: CustomStringConvertible {
    var description: String {
        var currentNode = head
        var descString = "["
        while currentNode != nil {
            descString += "\(String(describing: currentNode?.value))"
            currentNode = currentNode?.next
            if (currentNode != nil) {
                descString += ","
            }
        }
        return descString
    }
}

class StackUsingLL<T>: CustomStringConvertible {
    private var llList: LLLinkedList<T>?
    
    init(llList: LLLinkedList<T>) {
        self.llList = llList
    }
    
    func push(value: T) {
        //append the first element at the start of the linked list
        llList?.prepend(value: value)
    }
    
    func pop() -> T? {
        //remove the first node from the linked list and return it.
        let removedItem = llList?.removeFirstNode()
        return removedItem?.value
    }
    
    func peek() -> T? {
        return llList?.currentHead?.value
    }
    
    func isEmpty() -> Bool {
        return llList?.isEmpty ?? true
    }

    var description: String {
        var currentHead = llList?.currentHead
        var descString = "["
        while (currentHead != nil) {
            descString += "\(currentHead!.value)"
            currentHead = currentHead!.next
            if (currentHead != nil) {
                descString += ","
            }
        }
        return descString
    }
}

class LinkedListToStackAdapter {
    
    init() {
        let stack = StackUsingLL<Int>(llList: LLLinkedList())
        stack.push(value: 2)
        stack.push(value: 3)
        stack.push(value: 6)
        let poppedElement = stack.pop()
        print("popped element \(poppedElement, default: "NA")")
        let topElement = stack.peek()
        print("topElement \(topElement, default: "NA")")
        print("printed linked list \(stack.description)")
    }
}
