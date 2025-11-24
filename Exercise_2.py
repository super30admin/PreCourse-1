# Time Complexity : Push - O(1), Pop - O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
# 1. Use a linked list where 'top' always points to the most recently pushed node.
# 2. For push: create a new node, point its next to current top, and update top.
# 3. For pop: return the data from top and move top to top.next.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        # Create new node and add it at the top of stack
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        
    def pop(self):
        # If the stack is empty, return None
        if not self.top:
            return None
        
        popped_value = self.top.data
        self.top = self.top.next   # Move top to next node
        return popped_value
        
        
# ------------------- Example Interaction Code (as you provided) -------------------

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()

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
