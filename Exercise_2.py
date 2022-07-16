"""
Exercise_2 : Implement Stack using Linked List.

Time Complexity : O(1)
Space Complexity : O(N)

As Stack is a LIFO order operation.
Here Singly LinkedList is used as a data structure to replicate the functionality of Stack

push(), pop(), isEmpty()  all take O(1) time as we do not run any loop in any of these operations     




@name: rahul
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.size=0
   
        
   
    def push(self, data):
   
        #If The data to be added is a new Item
        #i.e head == None then the head is assigned with the Node(data) 
        #which creates a new first Node and the next points to None 
        if self.head == None:
            self.head= Node(data)
        
        #If The data to be added is not a new Item
        #then a temp variable is assigned with the Node(data) 
        #temp variable next points to the node when head points
        #Then head points to new added node and the size is incremented
        #This relects the LIFO
        else:
            newNode= Node(data)
            newNode.next = self.head
            self.head = newNode
            
            self.size +=1
            
    
        
        
    def pop(self):
        
        #Checks if the size is 0 as it represents no item in the list
        if self.is_Empty():
            return None
        
        
        # a temp variable points to the node the head points to
        # then the head points to the next node by head.next
        #Then the temp node is made to point None removing from the list
        #This relects the LIFO
        
        else:
            nodetoPop = self.head
            self.head = self.head.next
            nodetoPop.next = None
            self.size -=1
            
            return nodetoPop.data
        
        
    def is_Empty(self):
        if self.head==None:
            return True
        else:
            False
    
    def size(self):
        
        return self.size
        
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
