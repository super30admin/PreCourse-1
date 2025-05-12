# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Couldn't find this problem on Leetcode
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None  # Initialize head as None
        
    def push(self, data):
        # Create new node
        new_node = Node(data)
        # If stack is empty, make new node as head
        if self.head is None:
            self.head = new_node
        else:
            # Point new node's next to current head
            new_node.next = self.head
            # Update head to new node
            self.head = new_node
        
    def pop(self):
        # If stack is empty, return None
        if self.head is None:
            return None
        # Store current head's data
        popped_data = self.head.data
        # Move head to next node
        self.head = self.head.next
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
