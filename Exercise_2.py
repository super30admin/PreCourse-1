# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Starting with empty linked list
        self.head = None
    
    # Time Complexity: O(1) (constant time)
    # Space Complexity: O(1) (constant space)
    def push(self, data):
        if self.head is None: # If linked list is empty
            self.head = Node(data)
        else: # Add to top of list
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode
    
    # Time Complexity: O(1) (constant time)
    # Space Complexity: O(1) (constant space)
    def pop(self):
        if self.head is None: # Empty list. Nothing to pop
            return None
        else: # Pop from top
            delNode = self.head
            self.head = self.head.next
            delNode.next = None
            return delNode.data
        
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
