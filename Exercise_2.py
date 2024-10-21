# Time Complexity:
#   push()   : O(1) - Adding a new node at the top is a constant-time operation.
#   pop()    : O(1) - Removing the top node is also a constant-time operation.
#   isEmpty(): O(1) - Checking if the stack is empty takes constant time.

# Space Complexity: O(n) - Space grows with the number of nodes (elements) in the stack.

# Did this code successfully run on Leetcode? 
# Not applicable, but it works successfully in local environments.

# Any problem you faced while coding this:
# No issues encountered.

# Your code here along with comments explaining your approach:
# - We use a linked list to implement the stack.
# - Each stack element is represented as a Node.
# - `push()` adds a new node at the top.
# - `pop()` removes the top node and returns its value.
# - `isEmpty()` checks if the stack has any nodes.
# - We use a `while` loop to allow the user to push, pop, or quit dynamically.

class Node:
    def __init__(self, data):
       self.data = data # Store the data value
       self.next = None # Pointer to the next node
 
class Stack:
    def __init__(self):
        self.top = None  # Initialize the top of the stack as None

    def isEmpty(self):
        # Check if the stack is empty by seeing if the top is None
        return self.top is None

    def push(self, data):
        # Create a new node with the given data
        new_node = Node(data)
        # Link the new node to the current top node
        new_node.next = self.top
        # Update the top pointer to the new node
        self.top = new_node

    def pop(self):
        # Check if the stack is empty
        if self.isEmpty():
            return None  # Return None if the stack is empty

        # Get the data from the top node
        popped_data = self.top.data
        # Move the top pointer to the next node
        self.top = self.top.next
        return popped_data  # Return the popped value

# Initialize the stack
a_stack = Stack()

while True:
    # Provide input as a string, e.g., "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    
    # Process the operation from user input
    operation = do[0].strip().lower()

    if operation == 'push':
        # Push the given value onto the stack
        a_stack.push(int(do[1]))

    elif operation == 'pop':
        # Pop the top value from the stack
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))

    elif operation == 'quit':
        # Exit the loop
        break