# Time Complexity : O(1) ; All stack operation perform in constant time
# Space Complexity : O(n); n = number of elements in the stack
# Did this code successfully run on Leetcode : - 
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
      
    def push(self, data):
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode
     
    def pop(self):
        if self.head:
            x = self.head.data
            self.head = self.head.next
            return x
      

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
