
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.st=Node(-1) #-1 is ot valid data
        self.head=self.st
        
    def push(self, data):
        temp=Node(data)
        self.st.next=temp
        self.st=temp
        
    def pop(self):
        if self.head.next is None:
        # Stack is empty
            return None
        
        temp=self.head
        while(temp and temp.next.next!=None):
            temp=temp.next
        a=self.st.data
        temp.next=None  
        self.st = temp
        return a     

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
