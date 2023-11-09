# Time Complexity : O(1) for push, pop
# Space Complexity : O(N) where N is the number of element
from curses.panel import top_panel


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

   
    def push(self, data):
        n1 = Node(data)
        if self.top == None:
            self.top = n1
        else:
            n1.next = self.top
            self.top=n1

    def pop(self):
        if self.top==None :
            return None
        else:
            temp=self.top
            self.top=self.top.next
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
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
