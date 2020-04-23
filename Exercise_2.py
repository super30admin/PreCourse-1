# Time Complexity :O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
       self.prev = None
 
class Stack:
    def __init__(self):
        self.head = None
    def push(self, data):
        newnode = Node(data)
        if self.head == None:
            self.head = newnode
        else:
            newnode.next = self.head
            self.head = newnode
            
    def pop(self):
            
        if (self.head == None):
            return None
        else:
            self.removenode = self.head
            self.head=self.head.next
            self.removenode.next = None
            return self.removenode.data
            
        
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