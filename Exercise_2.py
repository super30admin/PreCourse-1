# Time Complexity : O(1) -- For stack push and pop operations. O(Number(while operations)) -- program time complexity if equivalent to number of times while is executed
# Space Complexity : O(len(stack)) = O(N) = Non-Contiguous space of O(N). Each node stores data and reference to the next node.
# Did this code successfully run on Leetcode : I could not find the Leetcode link for this
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Stack follows property of Last In First Out (LIFO)
# So here I am pushing a new node to the stack at its head. Also I am popping node from the head as it is the Last In element
# This helps to keep my overall time complexity for pushing and popping from stack as O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        if(not self.head):
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode
        
    def pop(self):
        if(not self.head):
            return
        popVal = self.head.data
        self.head = self.head.next
        return popVal
        
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
