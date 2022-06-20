
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=Node(0)
        
    def push(self, data):
        if self.head.data==0:
            self.head=Node(data)
        else:
            ptr=self.head
            while ptr.next is not None:
                ptr=ptr.next

            node=Node(data)
            ptr.next=node

        
    def pop(self):
        ptr=self.head
        while ptr.next.next is not None:
            ptr=ptr.next
        ptr.next=None
        
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
