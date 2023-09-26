# Time Complexity : O(1) for push, pop
# Space Complexity : O(1) as list is used to store elements
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No problem faced
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.counter = 0
        
    def push(self, data):
        new_node = Node(data)
        if(self.counter == 0):
            self.head = new_node
        else:
            self.head.next = new_node
            self.head = self.head.next
        self.counter+=1
        
    def pop(self):
        if(self.counter == 0):
            return None
        temp = self.head
        self.head = self.head.next
        self.counter-=1
        temp.next = None
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
