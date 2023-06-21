# Time Complexity : Push = O(1) POP O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :

# Any problem you faced while coding this :

# Your code here along with comments explaining your approach

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head= Node(None)
        self.first_node=True
        self.curr=self.head
        self.size=0
    def push(self, data):
        if(self.first_node):
            self.head.data=data
            self.curr=self.head
            self.size+=1
            self.first_node=False
        else:
            new_node= Node(data)
            self.curr.next=new_node
            self.curr=new_node
            self.size+=1
        
    def pop(self):
        top_val= self.curr.data
        temp=self.head
        if(temp.next==None):
            self.head=None
            self.size-=1
            return top_val
        
        while(temp.next!=self.curr):
            temp=temp.next
        temp.next=None
        self.curr=temp
        self.size-=1
        return top_val
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
