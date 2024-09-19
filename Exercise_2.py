  # Time Complexity : O(1)
  # Space Complexity : O(n)
  # Did this code successfully run on Leetcode : No 
  # Any problem you faced while coding this : No 

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None # stack starts empty 

    def push(self, data):
        new_node = Node(data) # Create a new node with the data
        new_node.next = self.top # Point new node to the current top
        self.top = new_node # Update the top to the new node

    def pop(self):
        if self.top == None:
            return None # If the stack is empty, return None
        popped_data = self.top.data
        self.top = self.top.next # Update top to the next node
        return popped_data 
        
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
