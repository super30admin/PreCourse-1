"""
TC: All Functions are O(1)

SC: pop is O(n)

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
class Stack:
    def __init__(self):
        self.top=None

    def push(self, data):
        if self.top==None:
            return None
        else:
            self.top=Node(data)
    def pop(self):
        if self.top==None:
            return None
        else:
            last_ele=self.top
            self.top=self.top.next
            last_ele.next=None
            return last_ele.data
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
