
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
    
class Stack:
    def __init__(self):
        self.top = None   
        
    def push(self, data):
        
        #if stack is empty
        if self.top == None:
            self.top = Node(data)
        #if stack is not empty
        else:            
            new_node = Node(data)
            new_node.next = self.top
            self.top = new_node
                
    
    def pop(self):
        #pop if stack not empty
        if self.top != None:
            popped = self.top.data
            self.top = self.top.next
            return popped
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
