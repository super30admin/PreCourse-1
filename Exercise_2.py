# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Intialising empty stack with no top element
        self.top = None
        
    def push(self, data):
        # Creating new node with the data
        new_node = Node(data)
        # Pointing new node to the current top
        new_node.next = self.top
        # Update the top pointer to the new node
        self.top = new_node

    def pop(self):
        # Check if stack is empty
        if self.top is None:
            return None
        # Store current top's data temporarily
        current_top = self.top.data
        # Update top to the next node after removing the current top
        self.top = self.top.next
        # return removed element
        return current_top
        
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
