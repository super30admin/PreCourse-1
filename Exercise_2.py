  # Time Complexity : O(1)
  # Space Complexity : O(n)
  # Did this code successfully run on Leetcode : Works on IDE

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.arr = None
        self.size = 0
        
    def push(self, data):
        self.size += 1
        if self.arr == None :
            self.arr = Node(data)
        else:
            currHead = self.arr
            dummy = Node(data)
            dummy.next = currHead
            self.arr = dummy
        
    def pop(self):
        if self.arr == None:
            return None
        self.size -= 1
        data = self.arr.data
        self.arr = self.arr.next
        return data
    
    def peek(self):
        if self.isEmpty():
         raise "Stack Empty"
        return self.arr.data
        
    def size(self):
       return self.size
    
    def isEmpty(self):
       return self.size == 0
        
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
