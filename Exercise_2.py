
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack=Node("nn")
        self.head=self.stack
        self.first=self.head
        self.ctr=0
        
    def push(self, data):
        print(data)
        self.first.next=Node(data)
        self.first=self.first.next
        self.ctr=self.ctr+1
        print(self.first, self.ctr)
        
    def pop(self):
        count=self.head
        print(count.data)
        ctr1=0
        while(ctr1<self.ctr-1):
            count=count.next
            ctr1=ctr1+1
        poppedelem=count.next.data
        count.next=None
        count=self.head
        return poppedelem 
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
