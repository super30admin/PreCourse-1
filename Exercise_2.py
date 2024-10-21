#Time Complexity:
#Pop() : O(1)
#Push() : O(1)

#Space Complexity:
# O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        #Intialize a pointer which points towards the top of the stack
        self.top = None
        
    def push(self, data):
        #Creating a new node with given data
        new_node = Node(data)
        #Making the new node point to the top of the stack
        new_node.next = self.top
        #Making the new node, new top of the stack
        self.top = new_node
        
    def pop(self):
        #IF the stack isempty, we will return None
        if self.top is None:
            return None
        else:
            #We will store the data value of top node
            temp = self.top.data
            #We will move the top node to next node
            self.top = self.top.next
            #We will return the data value of popped node
            return temp
        
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
