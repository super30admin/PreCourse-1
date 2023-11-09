# Implement Stack using Linked List.
# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : needed to brush up the concepts.

class Node:
    def __init__(self, data ):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head==None:                 # if stack is empty, point head to new node entry.
            self.head= Node(data)
        else:
            m= Node(data)                   # else, store data to temperary node 'm'
            m.next= self.head               # point next of 'm' to head
            self.head= m                    # slide up the head node to point to 'm'
        print("data pushed")

    def isempty(self):                      # checking if stack is empty
        if self.head == None:
            return True
        else:
            return False
    def pop(self):
        if self.isempty():                  # if empty, return None
            return None
        else:                               # else store top element in temp variable, slide down head to next element
            temp= self.head
            self.head=self.head.next
            temp.next = None                # point temp(popped element) to None.
            return temp.data                # return popped element data

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
