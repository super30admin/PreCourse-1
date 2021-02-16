class Node:
    def __init__(self, data, next):
        self.data = data
        self.next = next


class Stack:
    def __init__(self):
        self.head = None
        self.size = 0

    def __len__(self):
        return self.size

    def isEmpty(self):
        if self.size==0:
            return True
        else:
            return False

    def push(self, data):
        self.head = Node(data,self.head)
        self.size += 1

    def pop(self):
        if self.isEmpty():
            print("Stack is Empty!")
        else:
            value = self.head.data
            self.head = self.head.next
            self.size = self.size - 1
            return value

    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end="-->")
            temp = temp.next
        print()

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('display')
    print('size')
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
    elif operation =='display':
        a_stack.display()
    elif operation =='size':
        print("Size: ",a_stack.__len__())
    elif operation == 'quit':
        break
