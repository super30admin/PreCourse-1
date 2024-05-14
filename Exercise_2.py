# Time Complexity : O(1) for push() and pop() operations
# Space Complexity : O(1) for push() and pop() operations
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    
    # Initializes the head of the linked list
    def __init__(self):
        self.head = None
    
    # Adds a node to the beginning of the linked list
    def push(self, data):
        # Checks if the linked list is empty
        if not self.head:
            self.head = Node(data)
        # Checks if the linked list contains atleast one node
        else:
            newNode = Node(data) # Creates a node with the data
            newNode.next = self.head # Sets the next pointer of the new node to point to the current head node
            self.head = newNode # Sets the new node as the head of the linked list
        
    # Removes a node from the beginning of the linked list and return the data of the removed node
    def pop(self):
        # Checks if the linked list contains more than one node
        if self.head and self.head.next:
            poppedValue = self.head.data
            self.head = self.head.next # Sets the new head node to be the next node of the current head node
            return poppedValue
        # Checks if the linked list contains only one node
        elif self.head and not self.head.next:
            poppedValue = self.head.data
            self.head = None # Sets the head node to None
            return poppedValue
        # Checks if the linked list is empty
        else:
            return None
        
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
