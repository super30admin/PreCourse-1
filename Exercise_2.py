# Implement Stacks using Linked lists.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initialize the stack using linked list nodes.
        self.head = None

    def push(self, data):
        # Push the node onto the linked list stack.
        temp = self.head
        self.head = Node(data)
        self.head.next = temp

    def pop(self):
        # Pop the node out of the linked list stack.
        if not self.head:
            raise Exception('Popping out of an empty stack.')
        # store the top value to be popped out in a variable.
        top = self.head
        self.head = top.next
        return top.data

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
