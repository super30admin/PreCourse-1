#For both methods:
  # Time Complexity: O(1)
  # Space Complexity: O(1)
class Node:
    def __init__(self, data):
        self.data = data 
        self.next = None  
class Stack:
    def __init__(self):
        self.head = None  
  
    def push(self, data):
        new_node = Node(data)  # Creating  a new node with the given data
        if self.head is None:  #
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node
    def pop(self):
        if self.head is None:
            return None  # If the stack is empty, return None
        popped = self.head.data
        self.head = self.head.next      # If the stack is not empty, pop the top element
        return popped
    
a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))  # Push the given value onto the stack
    elif operation == 'pop':
        popped = a_stack.pop()  # Pop an element from the stack
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value:', popped)
    elif operation == 'quit':
        break
