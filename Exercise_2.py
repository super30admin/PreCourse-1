
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    #Initializing the head value
    def __init__(self):
        self.head = None
        
    # Time Complexity : O(n)
    #Approach : While adding the first node into the list point it to the head
    #For rest of thr elements : go to the end of the linked list and point the next val of the current last node
    #to the new node
    def push(self, data):
        newNode = Node(data)
        
        if(self.head is None):
            self.head = newNode
           
        else:
            cur_val = self.head
            while(cur_val.next is not None):
                cur_val = cur_val.next
            cur_val.next = newNode
                
     # Time Complexity : O(n) 
     # Approach : if the stack is empty nothing to pop
     # If the stack has only one element, pop the element out and point the head value to None
     #For the rest, pop the last element, but changing the previous node.next val to None and return the 
     #popped element
    def pop(self):
        if(self.head is None):
            print ("Stack is empty,cannot pop")
        else:
            cur_val = self.head          
            while(cur_val):
                prev = cur_val
                cur_val = cur_val.next
                if(cur_val is None):
                    poppedElement = prev.data
                    self.head = None
                    return poppedElement
                elif(cur_val.next is None):
                    poppedElement = cur_val.data
                    prev.next = None
                    return poppedElement
 

# Space Complexity while there are n elements in the stack is 0(n)       
        
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
        a_stack.listprint()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
            a_stack.listprint()
    elif operation == 'quit':
        break
