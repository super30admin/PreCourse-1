# Time Complexity : O(1) for each of the method implemented in class "Stack"
# Space Complexity : O(1) for each of the method implemented in class "Stack"
# Did this code successfully run on Leetcode : Not sure if this is a Leetcode problem.
# Any problem you faced while coding this : Yes, I haven't touched Linked List in a while. 
#                                           Had to do look into Linked List implementations on Google.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        if self.top == None:
            self.top = Node(data)
        
        else:
            nextNode = Node(data)
            nextNode.next = self.top
            self.top = nextNode
        
    def pop(self):
        if self.top == None:
            return None
        else:
            poppedNode = self.top 
            self.top = self.top.next #Moving next node of top node to top of stack 
            poppedNode.next = None
            return poppedNode.data

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
