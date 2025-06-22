# RIken Kapadia
# Time complexity:
# push(): O(1) - constant time to add node at the beginning
# pop(): O(1) - constant time to remove node from the beginning

# Space Complexity: 
# O(n) - where n is the number of elements in the stack.

# Node class to represent each element in the stack.
class Node:
    def __init__(self, data):
       self.data = data # top of the stack
       self.next = None # pointer to the next node
 
class Stack:
    def __init__(self):
        self.head = None # top of the stack
        self.length = 0 # Length of the stack.
        
    def push(self, data):
        new_node = Node(data)   # Create a new node 
        new_node.next = self.head # New node to current head
        self.head = new_node    # Update head with new node.
        self.length += 1    # increase stack size
        return self
        
    def pop(self):
        if self.length==0: # IF stack is empty returning None.
            return None
        temp = self.head    # store current top
        self.head = self.head.next  # move head to next node
        self.length -= 1    # decrease stack size
        return temp.data    # return popped data(value)
        
    
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