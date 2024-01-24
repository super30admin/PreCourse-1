# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.hd = Node(None)
        
    def push(self, data):
        tmp = Node(data)
        tmp.next = self.hd
        self.hd = tmp

    def pop(self):
        data = self.hd.data
        if data:
            self.hd = self.hd.next
        return data   
        
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
