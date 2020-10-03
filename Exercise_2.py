class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head==None:
            self.head = Node(data)
            self.head.next = None
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp

        
    def pop(self):
        if self.head == None:
            return None
        else:
            temp = self.head
            self.head = self.head.next
            temp.next = None
        return(temp.data)


    def peek(self):
        if self.head == None:
            return None
        else:
            return self.head.data

    def isempty(self):
        if self.head == None:
            return True
        else:
            return False

        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    print('peek')
    print('isempty')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('\nStack is empty.')
        else:
            print('\nPopped value: ', int(popped))
    elif operation == 'peek':
        print(a_stack.peek())
    elif operation=='isempty':
        print(a_stack.isempty())
    elif operation == 'quit':
        break
