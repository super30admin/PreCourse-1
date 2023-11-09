
#time complexity: O(1) for all
#space complexity: O(n) for n pushes
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        if self.top == None:
            self.top=Node(data) #if stack is empty
        else: #if stack is not empty, create new node, connect pointer next from newnode to top and assign the new node as top
            newnode = Node(data)
            newnode.next = self.top
            self.top = newnode
        

        
    def pop(self):
        if self.top is None: #empty stack
            return None
        else: #remove top
            temp=self.top
            self.top=self.top.next
        return temp.data
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
