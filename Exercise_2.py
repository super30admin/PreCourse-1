
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=Node(0)
        
    def push(self, data):
        if self.head.next is None:
            self.head=Node(data)
            return
        
        ptr=self.head
        while ptr.next is not None:
            ptr=ptr.next
        ptr.next=Node(data)
        
    def pop(self):
        if self.head.next is None:
            return 0
        
        ptr=self.head.next
        curr=self.head

        while ptr.next is not None:
            ptr=ptr.next
            curr=curr.next

        l=ptr.data
        curr.next=None
        return l
        
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
