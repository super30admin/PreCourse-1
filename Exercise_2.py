
# // Time Complexity :O(1)
# // Space Complexity : O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None  

    def push(self, data):
        new_node = Node(data)
        #append new node a a head of linked list so that when we want to pop, just have to remove first node instead of traversing till last node.
        new_node.next = self.top    
        self.top = new_node       

    def pop(self):
        if self.top is None:
            return None
        pop_node = self.top.data
        self.top = self.top.next 
        return pop_node
        
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
