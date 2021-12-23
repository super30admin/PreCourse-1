# Time Complexity : O(n) for push 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : not a problem on leetcode
# Any problem you faced while coding this : no

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        node = Node(data)
        if self.head == None:
            self.head = node
            return
        
        temp = self.head()
        while (temp.next):
            temp = temp.next
        temp.next = node

    def pop(self):
        temp = self.head()
        while temp.next:
            temp = temp.next
        del temp
        
        
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
