# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Taking time for implementation 

# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data, next):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.size = 0

    #add element, this method adds a new element to the top of stack   
    #self.head, a new node is created with the provided data and next pointer of the new node is set to current
    #head of stack. Then, head of stack is updated to point to the newly created node, adding new element to top of stack
    def push(self, data):
        self.head = Node(data, self.head)
        self.size = self.size + 1
    
    #checking if stack is empty or not
    def isEmpty(self):
        return self.size == 0

    #remove element and return top element 
    #to remove the element, 'head' of stack is updated to point to the next node in the stack  
    def pop(self):
        if self.isEmpty():
            return 
        value = self.head.data
        self.head = self.head.next
        self.size = self.size - 1
        return value
        
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
