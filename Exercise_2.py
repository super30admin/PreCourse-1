# Time Complexity : O(1)
# Space Complexity : O(n)

from types import NoneType


class Node:
    def __init__(self, data): # Create Node of LInked List
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self): # Head is NULL by deafualt
        self.head = None

    def isEmpty(self): # Check for empty Stack
        if self.head == None:
            return True
        return False

    def push(self, data): #Add data at top of the stack
        if self.head == None:
            self.head = Node(data)
        else:
            new = Node(data)
            new.next = self.head
            self.head = new
        
    def pop(self): # Remove data from top of the stack
        if self.isEmpty():
            return None
        node_remove = self.head
        self.head = self.head.next
        node_remove.next = None
        return node_remove.data

    def peek(self): #look for the top element of the stack
        if self.isEmpty():
            return None
        return self.head.data

a_stack = Stack()
a_stack.push(10)
a_stack.push(20)
a_stack.push(30)
print(a_stack.pop())
print(a_stack.peek())
