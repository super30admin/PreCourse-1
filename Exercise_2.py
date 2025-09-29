# Time Complexity :
         # Push: O(1)
         # Pop: O(1)
  
# Space Complexity : o(n)
         
# Did this code successfully run on Leetcode : NA

# Any problem you faced while coding this :NA

class Node:
    def __init__(self, data):
       #Initialize node
       self.data = data  # Store data
       self.next = None # Pointer to next node
 
class Stack:
    def __init__(self):
        self.top =None # Pointer to the top of stack (None means empty)
    def push(self, data):
        temp = Node(data) # Create new node with data
        temp.next=self.top # Link new node to current top
        self.top=temp # Update top to new node

    def pop(self):
        if self.top is not None:
            temp=self.top # Store current top
            self.top=temp.next # Move top pointer to next node
            return temp.data # Return popped data
        else: 
            return None # Stack underflow
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
