# Program name - Script to implement stack using linked list
# Author - Prajakta Pardeshi

# Time complexity for all the operations-
# push - O(1)
# pop - O(1)
# isempty - O(1)
# display - O(n)

# Space complexity for stack using linked list is O(n) where n is the number of elements


# class node willl define the structure of the node
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
# class stack will define all the operations of the node
class Stack:
    def __init__(self):
            self.head = None
            
    # push operation as a node
    def push(self, data):
        if self.head == None:
            self.head=Node(data)
             
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node
    
    # Checks if stack is empty
    def isempty(self):
        if self.head == None:
            return True
        else:
            return False
        
    # pop operation
    def pop(self):
        if self.isempty():
            return None    
        else:
            node = self.head
            self.head = self.head.next
            node.next = None
            return node.data
      
    # display the node
    def display(self):
         
        iternode = self.head
        if self.isempty():
            print("Stack is empty hence will underflow")
        else:
            while(iternode != None):  
                print(iternode.data," ",end = " ")
                iternode = iternode.next
        print("\n")
        return
        
        

# Driver program
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('display')
    print('quit')
    do = input('What would you like to do? ').split()
    
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop" or "display" or "quit"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'display':
        a_stack.display()
    elif operation == 'quit':
        break
        
    
