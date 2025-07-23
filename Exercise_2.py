# Time Complexity:
#   push  - O(1)
#   pop   - O(1)
#   is_empty - O(1)
#   peek  - O(1)

# Space Complexity:
#   O(n) where n is the number of elements in the stack (each node uses additional memory)

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None  # head will act as the top of the stack

    def is_empty(self):
        return self.head is None

    def push(self, data):
        new_node = Node(data)  # Create a new node
        if not new_node:
            print("/nStack Overflow")
            return
        new_node.next = self.head  # Link it to the current head (top)
        self.head = new_node  # Make it the new head (top)

    def pop(self):
        if self.is_empty():
            print("/nStack Underflow")
        else:
            temp = self.head  # Get the data to return
            self.head = self.head.next  # Move head to next node
            del temp


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
