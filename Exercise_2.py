
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=Node(0)
        
    def push(self, data):
        t=Node(data)
        if(not self.head.next):
            self.head.next=temp
        else:
            p=self.head.next
            while(p.next):
                p=p.next
            p.next=t
        
    def pop(self):
        if (self.head.next is None):
            return None
        previous=self.head
        current=self.head.next
        while(current.next):
            previous=current
            current=current.next
        previous.next=None
        return current.data
        
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
