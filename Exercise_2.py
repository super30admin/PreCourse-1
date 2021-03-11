class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        node = Node(data)
        node.next = self.head
        self.head = node
        
    def pop(self):
       
        tmp= self.head
        if tmp:
            
            if self.head.next!=None:
              self.head = self.head.next
              pop = tmp.data
              return pop
            else:
                self.head=None
                return tmp.data
                
        else:
            return None
         
        
        
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(1)
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
