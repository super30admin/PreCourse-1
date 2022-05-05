#Time complexity: Pop , Push , Peek all in O(1)
#Space complexity: O(N)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    top=0
    def __init__(self):
        self.head=None

    def isempty(self):
        return self.head == None
         
        
    def push(self, data):
        if not self.head:
            self.head=Node(data)
        else:
            new=Node(data)
            new.next=self.head
            self.head= new
        self.top+=1
       
        
    def pop(self):
        if self.isempty():
            return None
        delnode=self.head
        self.head=self.head.next
        delnode.next=None
        return delnode.data

    def peek(self):
        if self.isempty():
            return ('Stack is empty.')
        else:
            return (f"Top Element in stack:{self.head.data}")
        


        
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
