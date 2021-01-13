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
            temp=self.head
            while temp.next != None:
                temp=temp.next
            temp.next=Node(data)
        
    def pop(self):
        if self.head==None:
            return None
        elif self.head.next==None:
            val=self.head.data
            self.head=None
            return val
        else:
            temp=self.head
            while temp.next.next != None:
                temp=temp.next
            val=temp.next.data
            temp.next=None
            return val

    def show(self):
        if self.head==None:
            print("empty Stack")
        else:
            temp=self.head
            while temp != None:
                print(temp.data)
                temp=temp.next

    def isEmpty(self):
        if self.head==None:
            print("True")
        else:
            print("False")

    def peek(self):
        if self.head==None:
            return None
        else:
            temp=self.head
            while temp.next != None:
                temp=temp.next
            return temp.data


        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('isEmpty')
    print('peek')
    print('show')
    print('quit')
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
    elif operation == 'show':
        a_stack.show()
    elif operation == 'isempty':
        a_stack.isEmpty()
    elif operation == 'peek':
        value = a_stack.peek()
        if value is None:
            print('Stack is empty.')
        else:
            print('top value: ', int(value))
    elif operation == 'quit':
        break
