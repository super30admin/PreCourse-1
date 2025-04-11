class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.top = None  # Initialize the top of the stack

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top  # Point new node to current top
        self.top = new_node       # Update top to new node

    def pop(self):
        if self.top is None:
            return None  # Stack is empty
        popped_node = self.top
        self.top = self.top.next  # Move top to next node
        return popped_node.data

a_stack = Stack()
while True:
    print('\npush <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    
    if not do:
        continue
    
    operation = do[0].strip().lower()
    
    if operation == 'push':
        if len(do) < 2:
            print("Please provide a value to push.")
            continue
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value:', popped)
    elif operation == 'quit':
        break
    else:
        print("Unknown command. Try 'push <value>', 'pop', or 'quit'.")