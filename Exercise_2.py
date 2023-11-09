# implementing stack using linkedlists
# Time Complexity : O(1) for all functions
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : None
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    # initialising the top and node as None
    def __init__(self):
        self.top = None
        self.count = 0

    # pushing the data as the top element
    def push(self, data):
        node = Node(data)
        if node is None:
            return
        node.data = data
        node.next = self.top
        self.top = node
        self.count += 1

    # popping the top element
    def pop(self):
        self.count -= 1
        top = self.top.data
        self.top.data = self.top.next
        return top

    def print_stack(self):
        if self.top is None:
            print("stack is empty")
            return
        while self.top is not None:
            print(self.top.data,"-->",end = " ")
            self.top = self.top.next

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('print')
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
    elif operation == 'print':
        a_stack.print_stack()
        break
    elif operation == 'quit':
        break
