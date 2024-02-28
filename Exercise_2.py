# Time Complexity : push, pop : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Couldn't find this code on leetcode
# Any problem you faced while coding this : It was clear

class Node:
    def __init__(self, data):
       self.data = data # Data stored in the node
       self.next = None # Pointer to the next node in the stack
 
class Stack:
    def __init__(self):
        self.head = None # Initialize the stack to be empty
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data) # If stack is empty, new node becomes the head
        else:
            newNode = Node(data) # Create a new node
            newNode.next = self.head # New node points to the current head
            self.head = newNode # New node becomes the new head
        
    def pop(self):
        if self.head is None:
            return None # If the stack is empty return None
        else:
            po = self.head.data # Store the current head node to be popped
            self.head = self.head.next # Point head to the next node
            return po # Return the popped node
        
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
