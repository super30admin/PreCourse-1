# Time complexity:
# push operation = O(1)
# pop operation = O(1)
# Space complexity:O(n) (n is the number of elements)

# Did this code successfully run on Leetcode : Sucessfully runs on geegsforgeeks
# Any problem you faced while coding this :No


# Your code here along with comments explaining your approach
from pickle import NONE


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):

        self.head=None

    def push(self, data):
        #create new Node with data
        newNode=Node(data)
        # add new node to the head of the linkedlist to get the top of the stack
        newNode.next=self.head
        # reset the haed pointer to the new element
        self.head=newNode
        # return new head
        return self.head
    
    def pop(self):
        #  is stack is empty return
        if self.head is None:
            return self.head
        # store the data of top element
        p=self.head.data
        # head pointer moves forward to remove the first element
        self.head=self.head.next
        # return the data of element removed
        return p


a_stack = Stack()
while True:
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
