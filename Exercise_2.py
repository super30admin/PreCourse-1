# Time Complexity : O(N)
# Space Complexity : O(N)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        inp=Node(data)
        if self.head==None:
            self.head=inp
        else:
            temp=self.head
            while temp.next!=None:
                temp=temp.next
            temp.next=inp
        
    def pop(self):
        if self.head!=None and self.head.next!=None:
            temp=self.head.next
            prev=self.head
            while temp.next!=None:
                temp=temp.next
                prev=prev.next
            prev.next=None
            return temp.data
        else:
            k=self.head.data
            self.head=None
            return k
        
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
