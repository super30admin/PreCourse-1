# Time Complexity : O(1) for push and pop operations
# Space Complexity : O(n) where n is the number of elements in the stack
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.size = 0 
        
        
    def push(self, data):
        if self.top is None:
            self.top = Node(data)
        else:
            new = Node(data)
            new.next = self.top
            self.top = new
        self.size += 1
            
        
    def pop(self):
        if self.top is None:
            return None
        
        popped = self.top.data 
        self.top = self.top.next
        self.size -= 1
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
