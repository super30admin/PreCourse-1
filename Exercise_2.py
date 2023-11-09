
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
    def push(self, data):
        if self.head is None:
            self.head=Node(data)
            return
        temp=self.head
        while temp.next:
            temp=temp.next
        
        temp.next=Node(data)
        
    def pop(self):
        if self.head is None:
            return None
        
        temp=self.head
        
        while temp.next:
            if temp.next.next is None:
                value=temp.next.data
                temp.next=None
                return value
            temp=temp.next
        
        value=temp.data
        self.head=None
        return value
            
        
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