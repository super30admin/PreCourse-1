
# Time Complexity : O(1) for all operation 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Ran in terminal successfully
# Any problem you faced while coding this :
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
           node = Node(data)
           self.head = node
        else:
            nxtnode = Node(data)
            nxtnode.next = self.head
            self.head = nxtnode

    def pop(self):
        if self.head != None :
            frontnode = self.head
            self.head = self.head.next
            frontnode.next = None
            return frontnode.data
        else:
            return None


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
