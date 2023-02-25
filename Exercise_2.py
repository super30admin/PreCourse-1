# Time Complexity : 
  # Push : O(1)
  # Pop : O(1)
  # isEmpty : O(1)

# Space Complexity :
  # Push : O(1)
  # Pop : O(1)
  # isEmpty : O(1)

# Did this code successfully run on Leetcode : yes on VSCODE Editor
# Any problem you faced while coding this : no, had a question how is it different in linkedlist and array when we pop if stack is empty.


# // Your code here along with comments explaining your approach

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None

    def isEmpty(self):
        return True if self.root is None else False
        
    def push(self, data):
        nextNode = Node(data)
        nextNode.next = self.root
        self.root = nextNode
        print ("% d pushed to stack" % (data))
        
    def pop(self):
        if(self.isEmpty()):
            return None
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        return popped
        
a_stack = Stack()
while True:
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
