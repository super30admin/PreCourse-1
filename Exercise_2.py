#Exercise_2 : Implement Stack using Linked List.

#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Didn't find question on leetcode
#Any problem you faced while coding this : No

#Your code here along with comments explaining your approach

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None      #as head would be NULL
        
    def push(self, data):
        if self.head == None:           #check is stack is empty, if yes add element
            self.head = Node(data)
        newNode = Node(data)            #if stack not empty, create a new node
        newNode.next  = self.head       #assign new node as next node to head node
        self.head = newNode             #make new node as your head node
        
    def pop(self):
        if self.head == None:           #check is stack is empty, is yes, return none
            return None
        remNode = self.head             #pop the topmost node which is head node
        self.head = self.head.next      #set te next node as head node
        remNode.next = None            
        return remNode.data
        
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
