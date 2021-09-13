
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=None

    def push(self, data):
        new_node=Node(data)
        if new_node is None:
            return
        new_node.data = data 
        new_node.next = self.top
        self.top = new_node

    def pop(self):
        if self.top is None:
            print("Stack Underflow")
            return 0
        temp=self.top.data
        self.top = self.top.next
        return temp

    def isEmpty(self):
        return self.top is None

    def peek(self):
        if not self.isEmpty():
            return self.top.data
        else:
            print("The stack is empty")
            return -1

a_stack = Stack()


while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
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
    elif operation == 'peek':
        print(a_stack.peek())
