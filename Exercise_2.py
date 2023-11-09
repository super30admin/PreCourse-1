#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : No(but executed in VSCode successfully)
#Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    #root of the stack if Null by default
    def __init__(self):
        self.head=None
    #inserts the element to the beginning of the stack
    def push(self, data):
        #checking if head node is full or empty and inserting the element
        if self.head is None:
            self.head = Node(data)
        #creating a new node and then inserting the element if previous node is full
        else:
            topNode = Node(data)
            topNode.next = self.head
            self.head = topNode
        return self.head
    #removing the element from current top node
    def pop(self):
        #checking if the stack is empty before removing
        if self.head is None:
            return self.head             
        else:
            #if not empty remove the topnode and place the next node as top node
            endNode = self.head
            self.head = self.head.next
            endNode.next = None
            return endNode.data
        
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