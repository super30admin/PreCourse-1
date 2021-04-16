"""
Algorithm:
1. Maintain a top pointer which is always reference to the top of stack
2. If insert, first time direct insert if element is already present 
set the address of the new node to to the reference of top and set the top
reference to the new node
3. If pop, if top is none return None, else use a variable to reference the node to be popped,
set the reference of top to the address of the variable, set varibale next to None and then return the
data of variable node which is popped.
"""


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        if self.top == None:
            self.top = Node(data)
        else:
            node = Node(data)
            node.next = self.top
            self.top = node

        
    def pop(self):
        if self.top == None:
            return None
        else:
            rem_node = self.top
            self.top = rem_node.next
            rem_node.next = None
            return rem_node.data

        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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
