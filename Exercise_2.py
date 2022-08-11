#  Time Complexity : O(1) as we are removing and adding item at the beginning of linkedlist
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : I was not able to find this on leetcode
#  Any problem you faced while coding this : Struggled a bit to decide if the top should be at the beginning or end of the linkedlist
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    def isEmpty(self):
        if self.top == None:
            return True
        else:
            return False
        
    def push(self, data):
        if self.isEmpty():
            self.top = Node(data)
        else:
            temp = Node(data)
            temp.next = self.top
            self.top = temp
        
    def pop(self):
        if self.isEmpty(): # Nothing to pop
            return -1
        else:
            temp = self.top
            self.top = self.top.next
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
