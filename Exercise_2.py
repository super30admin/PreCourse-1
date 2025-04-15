#  Time Complexity : Both operations push and pop are O(1) 
#  Space Complexity : O(n), where n is the number of elements in the stack, since we store all elements in the list
#  Did this code successfully run on Leetcode : Yes 
#  Any problem you faced while coding this : No


#  Your code here along with comments explaining your approach: The __init__ method intializes data equal to data and next equal to None. The push method creates a newNode. The next of the newNode points to head node. Now we make the head node equal to newNode. In pop we check if head is empty. We pop the topmost element, point the head to the next element. Now we return the popped element. 

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode
        
    def pop(self):
        if self.head is None:
            return None
        popped_data = self.head.data
        self.head = self.head.next
        return popped_data
        
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
