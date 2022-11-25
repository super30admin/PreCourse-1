'''
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : did not find the question
// Any problem you faced while coding this : No
'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    def __init__(self):
        self.head = None

    def push(self, data):
        # if node empty initialize it with data
        if self.head == None:
            self.head = Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

    def pop(self):
        if self.head == None:
            #if node is not present return None
            return None
        else:
            temp = self.head
            self.curr = self.head.next
            temp.next = None
            return temp.data


        
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
