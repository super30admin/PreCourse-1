#The space complexity is the length of linked list going to be created
# The time complecity is O(1) for all operations

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
            a=Node(data)
            a.next=self.head
            self.head=a
    def pop(self):
        if self.head!=None:
            a=self.head
            self.head=a.next
            a.next=None
            return a.data
        else:
            return "Stack Underflow"
        
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
