class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        newNode=Node(data)
        if self.head==None:
            self.head=newNode
        else:
           traverseptr=self.head
           while traverseptr.next is not  None:
              traverseptr=traverseptr.next
           traverseptr.next=newNode

    def pop(self):
        fast=self.head
        prev=None
        while fast.next is not None:
            prev=fast
            fast=fast.next
        prev.next =None
        return fast.data

    def show(self):
        stacktraverse=''
        travrseptr=self.head
        while travrseptr is not None:
            stacktraverse+= ""+str(travrseptr.data) +" "
            travrseptr=travrseptr.next
        stacktraverse=stacktraverse.split()
        print(stacktraverse,len(stacktraverse))
        endresult=''
        for character in stacktraverse:
            print(character)
        for element in reversed(stacktraverse):
            print('in the loop',element)
           # endresult+=""+str(stacktraverse[element])

        return endresult
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    print('traverse')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'traverse':
        print(a_stack.show())


    elif operation == 'quit':
        break
