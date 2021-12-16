  #Exercise_2 : Implement Stack using Linked List.
  
  #Time Complexity : O(1) for push and peek but O(n) for pop 
  #Space Complexity : O(n)
  #Did this code successfully run on VSCode : Yes
  #Any problem you faced while coding this : None


  #Your code here along with comments explaining your approach

class Node:                         #Node class to hold item and its reference
    def __init__(self, data):       #constructor with instance variablles 'data' and 'next' 
       self.data = data
       self.next = None
 
class Stack:                        #Stack class to construct Stack
    def __init__(self):             #Constructor. Initizlizing first element (head) to 'None' (empty list)
        self.head = None
        
    def push(self, data):           #pushing adds node data to the beginning (head) of the linked list in Stack
        if self.head is None:       #if list is empty, add node and point 'head' to the node address
            self.head = Node(data)   
        else:                       ##Else, add new node to the beginning, point head to the new node and the old (original) 'head' to the next node
            new_node = Node(data)   
            new_node.next = self.head
            self.head = new_node
        
    def pop(self):                     #popping removes node from the beginning and returns the remomved node data
        if self.head is None:           #If there is no node, list is empty and return None
            return None
        else:                           #Else return the data of the node being popped. Change head to next node
            popped_node = self.head.data
            self.head = self.head.next
            return popped_node
        
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
