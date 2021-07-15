"""
Time Complexity : O(1)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :
"""
MAX = 1000
class Node:
    #Initialize Node object
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    #count to keep track of the size
    count = 0 
    #Initialize head
    def __init__(self):
        self.head = None
    
    #Check if the Stack is empty
    def isEmpty(self):
        if self.count == 0:
            return True
        else:
            return False
    """Stack implementation so we will make the 
        new element inserted as head node
        so that it follows LIFO operations. Also 
        check for overflow by keeping tap of the 
        size of the linked list using  count varibale """
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
            self.count += 1
        else:
            if self.count == MAX:
                print("Stack Overflow")
                return 0
            else:
                newDataNode = Node(data)
                newDataNode.next = self.head
                self.head = newDataNode
                self.count += 1
    """Stack implementation so we will delete
        the head node as we inserted the node in the head 
        and stack follows LIFO operations. Also 
        check for Underflow checking if the list is 
        empty or not"""
    def pop(self):
        if(self.isEmpty()):
            print("Stack Underflow")
            return None
        else:
            element = self.head.data
            self.head = self.head.next
            return element
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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
