
class Node:
    def __init__(self, data=None):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.head = None  # Initialize an empty stack with no head
        
    def push(self, data):
        new_node = Node(data)  # Create a new node with the given data
        new_node.next = self.head  # The next node after the new node will be the current head
        self.head = new_node  # The new node becomes the new head
         #time complexity : O(1)
        #space complexity : O(n)
        
    def pop(self):
        if self.head is None:  # If the stack is empty return None
            return None
        popped_data = self.head.data  # Store the data of the head (node to be popped)
        self.head = self.head.next  # The next node becomes the new head
        return popped_data  # Return the popped data
         #time complexity : O(1)
        #space complexity : O(n)

a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    
    operation = do[0].strip().lower()
    if operation == 'push':
        if len(do) < 2:  # Check if the user has provided the value to push
            print("Please provide a value to push.")
            continue
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
