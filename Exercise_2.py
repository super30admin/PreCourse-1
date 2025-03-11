# Time Complexity:
# push(): O(1) - Adding a new node at the beginning of the linked list takes constant time
# pop(): O(1) - Removing the first node of the linked list takes constant time
# Space Complexity: O(n) - where n is the maximum number of elements in the stack
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Initialize an empty stack
        self.top = None
        
    def push(self, data): 
        # Create a new node with the given data
        new_node = Node(data)

        # Make the new node point to the cuurrent top 
        new_node.next = self.top

        # Update the top to be the new node 
        self.top = new_node 
        
    def pop(self): 
        # Check if stack is empty
        if self.top is None:
            return None

        # Save the data from the top node
        popped_data = self.top.data

        # Update the top to be the next node
        self.top = self.top.next

        # Return the popped data
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
