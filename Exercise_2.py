# Time Complexity : all operations O(1).
# Space Complexity : O(N) where N is total elements pushed
# Any problem you faced while coding this : no

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 

class Stack:
    def __init__(self):
        self.MAX = 1000
        self.root = None
        self.counts = 0
        
    
    def push(self, data):
        # check if capacity reached
        if self.counts == self.MAX:
            return None
        if self.root is None: # first element
            self.root = Node(data)
        else: # insert from root so that pop operations are O(1)
            new_node = Node(data)
            new_node.next = self.root
            self.root = new_node
        self.counts += 1
        
    
    def pop(self):
        if self.root is None:
            print("Stack Underflow")
            return 0
        node = self.root
        self.root = self.root.next
        self.counts -= 1
        return node.data
    

    def isEmpty(self):
        return self.root is None
    

    def peek(self):
        if self.root is None:
            return 0
        else:
            return self.root.data




        
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
