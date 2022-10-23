# Time Complexity: O(1), as insertion and deletion will not need traversal of any other Nodes
# Space Complexity: O(N)

from tkinter import Variable
from xml.dom.minicompat import NodeList

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    # Initialize a top pointer to represent the element on top of the stack
    def __init__(self):
        self.top = None

    # create a new node and point the next of the node to the previous node if the top is not None
    # otherwise, create a new node and assign it to the top
    def push(self, data):
        if self.top:
            self.next = self.top
            self.top = Node(data)
        else:
            self.top = Node(data)

    # to pop a node first save the top node into a Variable
    # then move the top pointer to the previous node
    def pop(self):
        if self.top:
            current_top = self.top.data
            self.top = self.top.next
            return current_top
        else:
            return None

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break