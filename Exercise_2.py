# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NO
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None        #Intializing Head with None Type
        
    def push(self, data):
        new_node=Node(data)      # Memory Alocation for new Node 
        if (self.head==None):    # If Stack is empty Assign head with new Node
            self.head=new_node
            return
        else:
            iterr=self.head            #Treverse to End of List using temp variable iterr 
            while(iterr.next != None):
                iterr=iterr.next
            iterr.next=new_node       #Assign Last node's next with new node
        
        
    def pop(self):
        if(self.head==None): # If stack is empty just returns None
            return
        
        iterr=self.head
        if(iterr.next==None):# If Stack had only one Element stores its data and assign head with None
            a=iterr.data
            self.head=None
        else:
            while(iterr.next.next is not None): # Else travsese to last but one node and stores next node's data and assign current node's next to none
                iterr=iterr.next
            a=iterr.next.data
            iterr.next=None
        return (a)

        
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
