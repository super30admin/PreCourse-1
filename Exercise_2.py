
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
    def __repr__(self):
        return repr(self.data)
 
class Stack:
    def __init__(self):
        self.head=None
    def push(self, data):
        if self.head==None:
            self.head=Node(data)
            return self.head
            #print('data pushed is ',self.head.data )
            #print("Data inserted is",self.head.data)
        else:
            temp=Node(data)
            temp.next=self.head
            self.head=temp
            return temp.data
            #print("Data inserted is",self.head.data)
              
    def pop(self):
        if self.head==None:
            print("Linked List is empty")
        else:
            temp=self.head
            self.next=self.head.next
            temp.next=None
            print("Popped value",temp.data)
            return temp.data
                           
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
        print(a_stack.push(int(do[1])))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
