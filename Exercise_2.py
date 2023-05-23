'''
Time Complexity : 
  Push operation is O(1) and pop operation is O(n)
  where n is number of elements in stack
  
Space Complexity : 
  O(n), where n is number of elements in stack

Did this code successfully run on Leetcode : 
  Not on leetcode

Any problem you faced while coding this : 
  pop operation functionality


#Your code here along with comments explaining your approach
  implemented stack using singly linked list
  keeping head and tail pointers so that push operation is O(1)
  for pop, if single element then it is O(1) else
  will traverse till end of array to delete it.
  show method() displays all elements of linked list.

'''

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.tail = Node(None)
        self.count = 0
        
    def push(self, data):
        newnode = Node(data)
        if self.count==0:
            self.head.next = newnode
        else:
            prev = self.tail.next
            prev.next = newnode
        
        self.tail.next = newnode
        self.count+=1
        
    def pop(self):
        if self.count==0:
            print('Stack Underflow')
            return 0
        if self.count==1:
            ele = self.head.next.data
            self.head.next = None
            self.tail.next = None
            self.count-=1
            return ele
        else:
            cur = self.head.next
            prev = None
            while cur.next!=None:
                prev = cur
                cur = cur.next
            ele = cur.data
            prev.next = None
            self.tail.next = prev
            self.count-=1
            return ele
        
    def show(self):
        cur = self.head.next
        while cur:
            print(cur.data)
            cur = cur.next
        
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
        a_stack.show()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
            a_stack.show()
    elif operation == 'quit':
        break
