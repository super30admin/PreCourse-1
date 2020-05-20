class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=Node(None)
        
    def push(self, data):
        new_node=Node(data)
        if(self.head.next==None):
            self.head.next=new_node
        else:
            temp=self.head
            while(temp.next!=None):
                temp=temp.next
            new_node=Node(data)
            temp.next=new_node
            
    def pop(self):
        if(self.head.next==None):
            return None
        else:
            temp=self.head.next
            prev=self.head
            while(temp.next!=None):
                temp=temp.next
                prev=prev.next
            prev.next=None
            return(temp.data)
        
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
