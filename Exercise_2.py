# Pushing and Popping from the stack are efficient Big O(1) operations since one can do both operations in constant time by accessing top of the stack parameter.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.stack = []                 # Initialize an empty stack

    def push(self, data):
        self.stack.append(data)         # Push values to the top of the stack

    def pop(self):
        if len(self.stack) != 0:
            return self.stack.pop()     # Pop values from the stack in Last In First Out Manner


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
