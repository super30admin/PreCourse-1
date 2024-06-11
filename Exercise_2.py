#The given code implements a stack using a linked list in Python. The Node class represents each element in the stack, with a data value and a next pointer. The Stack class manages the stack with a head pointer. The push method adds a new node to the top of the stack, and the pop method removes and returns the data from the top node. The user interaction loop reads commands to push or pop values, updating the stack accordingly, and terminates when the user inputs quit. This ensures efficient stack operations with constant time complexity for both push and pop.
#Time complexity: O(1), Space Complexity: O(n)
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        if self.head is None:
            return None
        popped_node = self.head
        self.head = self.head.next
        return popped_node.data

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
