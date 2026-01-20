# Time Complexity : O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran it locally
# Any problem you faced while coding this : Forgot what actually stack means and build a queue using linkedlist
# Staying focussed and aware is what I need to improve on.
# Learned to write comments using ''''''


# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        '''Create an empty pointer to store the top of the linked list/stack'''
        self.linkedListTop = None
        
    def push(self, data):
        '''Creating a node with the data to add to the top of the linked list'''
        dataNode = Node(data)
        if self.linkedListTop is None:
            self.linkedListTop = dataNode
        else:
            '''Adding datanode to the top of the linked list and setting the linkedListTop to it'''
            dataNode.next = self.linkedListTop
            self.linkedListTop = dataNode

    def pop(self):
        if self.linkedListTop is  None:
            return None
        '''Removing the top node and setting linkedListTop to the next node in the list'''
        poppedData = self.linkedListTop.data
        self.linkedListTop = self.linkedListTop.next
        return poppedData
        
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
