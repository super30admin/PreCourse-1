#push and pop operations are O(1).


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if(self.head == None):
            self.head = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode
        return self.head
        
    def pop(self):
        if(self.head == None):
            return None
        else:
            temp = self.head
            self.head = temp.next
            temp.next = None
            return temp.data
        
a_stack = Stack()
