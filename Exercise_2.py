
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        self.length=0
        
    def push(self, data):
        if self.top is None:    
            self.top = Node(data)
        else:                   
            new_node=Node(data)
            new_node.next=self.head
            self.head=new_node
            self.length+=1
            
        def pop(self):
        if self.top is None:    
            return None
        else:                  
            item=self.head
            self.head=self.head.next
            self.length-=1
            item.next=None
            return self.item.data
        
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
