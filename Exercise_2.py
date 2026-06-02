# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.tail = self.head
        self.count = 0
        
    def push(self, data):
        newNode = Node(data)
        if self.tail == self.head:
            self.head.next = newNode
        else:
            self.tail.next = newNode
        
        self.tail = newNode
        self.count += 1

        
    def pop(self):
        if self.count > 0:
            data = self.tail.data
            temp = self.head
            while temp.next != self.tail:
                temp = temp.next
            
            self.tail = temp
            self.tail.next = None
            self.count -= 1

            return data
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
