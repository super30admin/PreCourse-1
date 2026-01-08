//
//  LinkedList.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 12/16/25.
//


/*
 To implement a linked list, we need two primary components
 A Node class - to hold the data aand reference ot the next node
 LinkedList class - to manage the nodes and provide methods for operations like insertion and traversal
 */

class Node<T> {
    var value: T
    var next: Node<T>? //refrence to the next node in the linkedlist.
    
    init(value: T, next: Node<T>? = nil) {
        self.value = value
        self.next = next
    }
}

//the linkedlist class
class LinkedList<T> {
    private var head: Node<T>?
    private var tail: Node<T>?
    
    var isEmpty: Bool {
        return head == nil
    }
    
    init() { }
}

//append - insert at the end of the LinkedList
extension LinkedList {
    func append(value: T) {
        let newNode = Node(value: value)
        if let currentTail = tail {
            currentTail.next = newNode
        } else {
            //If the list was empty, then the new node is both head and tail
            head = newNode
        }
        tail = newNode
    }
    
    //prepend - insert at the beginning
    //This add a new node to the front of the list, which is an O(1) operation.
    func prepend(value: T) {
        let newNode = Node(value: value)
        if let currentHead = head {
            newNode.next = currentHead
        } else {
            //if the list is empty then head and tail both will be the new node
            tail = newNode
        }
        head = newNode
    }
}

//Traversal and display (optional, for testing)
extension LinkedList: CustomStringConvertible {
    //you can loop through the list to print it's elements. Can make linkedList conform to the CustomStringConvertible  to easily prints it's elements
    var description: String {
        var text = "["
        var currentHead = head
        while let node = currentHead {
            text += "\(node.value)"
            currentHead = node.next
            if currentHead != nil  {
                text += ", "
            }
        }
        return text + "]"
    }
}

class LinkedListPractice {
    init() {
        let linkedList = LinkedList<String>()
        linkedList.append(value: "a")
        linkedList.append(value: "b")
        linkedList.append(value: "c")
        print(linkedList)
    }
}
