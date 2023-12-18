# // Time Complexity : O(1) for both push and pop
# // Space Complexity : O(n) since we are creating a node for each element
# // Did this code successfully run on Leetcode : NA
# // Any problem you faced while coding this : Was thinking about adding new nodes to current next node
# later understood that adding existing nodes to next node of new code will help with better time complexity
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stackLinked = None
        
    def push(self, data):
        newNode = Node(data)
        if self.stackLinked == None:
            self.stackLinked = newNode
        else:
            newNode.next = self.stackLinked
            self.stackLinked = newNode
        
    def pop(self):
        if self.stackLinked == None:
            return None
        else:
            valuePoped = self.stackLinked.data
            self.stackLinked = self.stackLinked.next
            return valuePoped

        
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
