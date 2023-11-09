#Space complexity for Node class is O(1)    
#Space complexity for Stack class is O(n) where n is the number of elements in the stack
#Time complexity for push and pop operations is O(1) because it either inserts or removes the node in the top
#Executed the code in Leetcode but throwing an error while taking input whereas in other compiler it is working well
#I faced no problem while implementing the code

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

#head contains the address of the peek element
class Stack:
    def __init__(self):
        #we are initialising the head to none
        self.head=None 
        
    def push(self, data):
        if self.head==None:
            #Here we are going to insert first value into stack, and we are storing the address into head  
            self.head=Node(data) 
        else:
            #If we already have data in stack
            #We are creating a new node 
            new_node=Node(data) 
            #We are placing the address value present in head into new node created
            new_node.next=self.head
            #We are updating head value with new value 
            self.head=new_node 
        
    def pop(self):
        if self.head==None:
            #If the stack is empty none will be retruned
            return None 
        else:
            #We are creating a temp to store the value of head
            temp=self.head 
            #We are updating the head value to the new address
            self.head=self.head.next
            #We are making the address value of the temp to none
            temp.next=None
            return temp.data
        

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
