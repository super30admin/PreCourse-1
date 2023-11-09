# Exercise_2 : Implement Stack using Linked List.
# // Time Complexity :
  # push : 
  # pop : output 
  # peek
  # size
  # show 
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : No leetcode handle given 
# // Any problem you faced while coding this : 
# // Your code here along with comments explaining your approach
# """
# We will add at the end of the linked list and remove the last node of the linked list to implement this stack.
# there will be a pointer to the head  and another pointer pointing to the last element of the linked list always. 
# """
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
       self.previous = None 

class Stack:
    def __init__(self):
        self.numElements=0
        self.first = None 
        self.curr = None

    def push(self, data):
        newnode = Node(data)
         
        if self.numElements==0:
            self.first=newnode
        else :
            newnode.previous = self.curr ; 

        self.curr=newnode
        self.numElements +=1 

    def pop(self):
        if self.numElements ==0:
            return None 

        return_node  = self.curr
 
        if self.numElements ==1:
            self.first= None 
            self.curr = None
        else:
            self.curr = return_node.previous
            return_node.next = None 
        self.numElements -=1
        return return_node.data

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
            print('Popped value: ', int(popped) )
    elif operation == 'quit':
        break
