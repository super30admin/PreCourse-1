# Time Complexity: O(1)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode?: Ran succesfully on code editor
# Any problem you faced while coding this: No


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            new = Node(data)
            new.next = self.head
            self.head = new
    
    def pop(self):
        if self.head == None:
            return "Stack is empty"
        else:
            popp = self.head.data
            self.head = self.head.next
            return popp
        
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
