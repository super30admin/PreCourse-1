class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        if self.head==None:
            self.head=Node(data)
        else:
            newnode=Node(data)
            newnode.next=self.head
            self.head=newnode

    def pop(self):
        if self.head==None:
            return None
        else:
            poped=self.head
            self.head=self.head.next
            return poped.data
        
o = Stack()
o.push(3)
while True:
    print('push <value>')
    print('pop')
    print('exit')
    choice = str(raw_input('enter choice ').split())
    operation = choice[0].lower()
    if operation == 'push':
        o.push(int(choice[1]))
        print("pushed success")
    elif operation == 'pop':
        poped = o.pop()
        if poped is None:
            print('Stack is empty.')
        else:
            print('Poped value->', int(poped))
    elif operation == 'exit':
        break
