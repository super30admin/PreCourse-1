# Time Complexity:
#O(1) for push(), pop() 

# Space complexity
# O(1) for isEmpty(), pop()
# O(n) for push()

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.firstNode = None
        
    def push(self, data):
        if self.firstNode == None:
            self.firstNode = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.firstNode  #point the next pointer of above created Node to prevous Node in stack
            self.firstNode  = newNode     # update the head(pointer) to latest Node

    def pop(self):
        
        # check if the stack is empty() , if empty, return None
        if self.firstNode == None:
            return None 
        else:
            popped = self.firstNode
            self.firstNode = popped.next
            popped.next = None
            return popped.data

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
