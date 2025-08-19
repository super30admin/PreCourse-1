"""
Time Complexity: O(1) Constant for all operations, as we access and move pointers. 
Space Complexity: Each element consumes a node, hence for N elements, the complexity is linear i.e O(N) 

Notes: 
It is interesting to have a pointer before, which just keeps track of the top of the list all the time, which can be used to push elements in a stack fashion. 
"""

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.point = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.point
        self.point = new_node
        
        
        
    def pop(self):
        if self.point == None: 
            return None
        val = self.point.data
        self.point = self.point.next 
        return val
        
        
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
