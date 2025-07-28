
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Time: O(1), Space: O(1)
        # initialized the start of the linked list to None to represent an empty stack
        self.start = None
    
    def push(self, data):
        # Time: O(1), Space: O(1)
        # created a new node with the data as value, then updated start to point to this new node since it is now the top of the stack
        new = Node(data)
        new.next = self.start
        self.start = new
        
    def pop(self):
        # Time: O(1), Space: O(1)
        # checking if linked list is empty or not, if empty will return None else return the value of the popped element and reset start to the next topmost element
        if self.start is None:
            return None
        popped = self.start.data
        self.start = self.start.next
        return popped
        
        
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
