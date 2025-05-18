# Exercise_1 :  Implement Stack using Linked List.

# Time Complexity : O(1)
# Space Complexity : O(n) - overall O(n), depends on the number of elements added 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : The first problem was with the concept, I thought 
#         that we can add an elemenet at the end of the linkedlist and have the remove the 
#         element which is at the very end. But, then I saw how Linkedlist works. 
# Your code here along with comments explaining your approach -  

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    # initializing a head node 
    def __init__(self):
        self.head = None 
          
    # adding a new element at the front of the linkedlist - similar as push in stack 
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.head 
        self.head = newNode 
        
    # removing and returning the element from the front of Linkedlist - similar as stack 
    def pop(self):
        if self.head == None:
            return None
        pop_data = self.head.data
        self.head = self.head.next
        return pop_data
                                                      

a_stack = Stack()

while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push 20')
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
