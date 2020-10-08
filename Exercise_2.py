 # Time Complexity : push O(n) pop O(1) overall O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :not checked yet
# Any problem you faced while coding this :
# stack means first in last out
# push in list will insert new element at front only
#pop remove element at from front then point to make next linked element at front
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.head=Node("last")# adding dummy element front first
    # deafult element  is last
    # push 1 // 1->last
    #puch 2 // 2->1->last // adding at front of the list
    def push(self, data):
        tempNode=Node(data)
        tempHead=self.head
        #print(self.head.data)
        if tempHead.next==None:
            tempNode.next=self.head
            self.head=tempNode
            #head.next=tempNode
        else:
            prev=None
            while tempHead.next!=None:
                prev=tempHead
                tempHead=tempHead.next
            tempNode.next=prev
            self.head=tempNode

    # 2->1->last
    def pop(self):
        tempHead=self.head
        if tempHead.data=="last":
            return None
        else:
            tempData=tempHead.data
            self.head=tempHead.next
            del tempHead
        return tempData

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()

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
