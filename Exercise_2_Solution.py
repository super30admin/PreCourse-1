#Stack uing linked list

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    #If stack is empty
    def isEmpty(self):
        return self.head is None
    
    #Push an element in stack
    def push(self, item):
        newNode = Node(item)
        newNode.next = self.head
        self.head = newNode

    #pop from stack
    def pop(self):
        if not self.isEmpty():
            poppedItem = self.head.data
            self.head = self.head.next
            return poppedItem
        else:
            return None

    #Peek in the stack
    def peek(self):
        if not self.isEmpty():
            return self.head.data
        else:
            return None

    #Size of the stack
    def size(self):
        current = self.head
        count = 0

        while current:
            count += 1
            current = current.next
        return count