'''
Approach

1. Push():
    Create an object of class node Perform check of length
    If new node, then pt head and tail to the new node and update the length
    If not, then update the tail.next ptr to the new node. Once done, update the tail ptr to new node
    Time Complexity: 0(1) as we are just updating the ptr

2. Pop():
    Ignore the boundary case, self explanatory
    Iterate the current linked-list to pt to tail-1 node
    Afterwards update the references i.e currentNode.next = None
    and afterwards tail = currentNode

Time Complexity: 0(n) because we are iterating the list 1 time to reach tail-1 node

Didn't check on leet-code. Don't have problem link
'''

class Node:

    def __init__(self, data):
       self.data = data
       self.next = None
       self.previous = None
 
class Stack:

    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0
         
    def push(self, data):
        # Create an obj of class node
        objNewNode = Node(data)
        
        # Check if length > 0
        if self.length == 0:
            # No element in the linkedlist
            self.head = objNewNode
            self.tail = objNewNode
        
        else:
            # Elements already available in the linked-list
            # 1. pt "next" of tail to "objNewNode"
            objNewNode.previous = self.tail
            self.tail.next = objNewNode
            
            # 2. Update tail to "objNewNode"
            self.tail = objNewNode
         
        # Increase the length of linked-list
        self.length += 1
        
    def pop(self):
        
        print('Value of node to remove:\t',self.tail.data)
        
        
        if self.length == 1:
            self.tail = None
            self.head = None
        
        else:
            toPopNode = self.tail
            
            self.tail = toPopNode.previous
            self.tail.next = None
            
            toPopNode.previous = None
                            
        self.length -= 1

        
a_stack = Stack()

while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
