'''
Time complexity : 
O(1) for both push and pop operations beacause we are appending on the front of singly linkedlist we are justing changing the pointer of the head so it takes constant time"

Space Complexity : 
0(1) it takes constant space as we are using any additional memory to perfrom Push and pop
'''
# this class is used to create nodes for linked list
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
# Stack class
class Stack:
    # initializing head to None and size to 0
    def __init__(self):
        self.head = None
        self.size_ = 0
    # creating a temp Node and then pointing its next to present head and then making that temp node as head 
    def push(self, data):
        temp = Node(data)
        temp.next = self.head
        self.head = temp
        self.size_ += 1
    # first we check if the stack is empty or not then we store head in res variable to return result then pointing head to present head next Node
    def pop(self):
        if(self.size_>0) :
          res = self.head
          self.head = self.head.next
          self.size_ = self.size_ - 1
          return (res.data)
        else :
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