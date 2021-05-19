class EmptyStackError(Exception):
    pass


class Node:
    def __init__(self,value):
        self.value=value
        self.next=None


class Stack:
    def __init__(self):
        self.top=None

    def is_empty(self):
        return self.top == None

    def push(self,data):
        temp=Node(data)
        temp.link = self.top
        self.top=temp

    def pop(self):
        if self.is_empty():
            raise EmptyStackError("Stack is Empty")
        popped=self.top.value
        self.top=self.top.link
        return popped

    def printList(self):
        temp = self.top
        while (temp):
            print(temp.value)
            temp = temp.link
        return

#driver_code

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    print('print')
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
    elif operation == 'quit':
        break
    elif operation == 'print':
        a_stack.printList()