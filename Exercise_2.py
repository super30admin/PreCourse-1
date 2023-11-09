

# // Any problem you faced while coding this : It was not easy and took time but now it looks easy ... Thank you for this assignment 
#

# // Your code here along with comments explaining your approach
# // Time Complexity : 0(1) // push, pop as it's popping from first and pushing at first
# // Space Complexity : 0(n) // it's filling in the stack


# Defining the node class for node data initialization and pointer(next) to none at the begning
class Node:
     def __init__(self, data):
        self.data = data
        self.next = None
 
 # implementation of stack using linked list
class Stack:
    # initializing head node with none
    def __init__(self):
        self.head = None
        
    # start inserting the data 
    # if head is None that means the stak is empty so put the  data into first node and assign to self.head
    # else create a node with data at the starting and assign the current head to newnode.next
    # and new node as self.head
    def push(self, data):
        
        if self.head == None:
            self.head = Node(data)
 
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
    #  if head == none then print stack is empty 
    #  popednode is current head now assign next element to self.head and remove the first node
    
    def pop(self):
        if self.head == None:
            print ('Stack is empty')
        else:
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
            return poppednode.data
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push 5')
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