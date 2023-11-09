# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Could n't find problem in leetcode

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        x=Node(data)
        if self.head==None:
            self.head=x
        else:
            x.next=self.head
            self.head=x
        print('Element is Inserted')
        
        
    def pop(self):
        if self.head==None:
            return None
        else:
            x=self.head
            self.head=self.head.next
            x.next=None 
        return x.data

    def show(self):
        if self.head==None:
            print("Stack is Empty")
        else:
            x=self.head
            while(x):
                print(x.data)
                x=x.next
        
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('show')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        print(popped)
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
    else:
        a_stack.show()
