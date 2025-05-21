# Time Complexity : O(1)
# Space Complexity :  O(n)
# Did this code successfully run on Leetcode : I did not run it on Leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    #Defined a stack pointer and size
    def __init__(self):
        self.top = None
        self.max= 1000
        self.size = 0

    #Check stack overflow
    def push(self, data):
        new_node = Node(data)
        if self.size >= self.max:
            return 'stack is full'
        else:
            new_node.next=self.top
            self.top=new_node
            self.size += 1

    #Check stack underflow
    def pop(self):
        if self.size == 0:
            return None
        else:
            popped = self.top.data
            self.top = self.top.next
            self.size -= 1
            return popped

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
