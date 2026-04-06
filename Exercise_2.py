
# // Time Complexity : O(1)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :
# did it in O(n) first but can be done in O(1) time. add at begining of linked list, always add to front of list - thats top of stack

# // Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        if not self.head:
            self.head = newNode
        else:
            newNode.next = self.head 
            self.head = newNode 

    def pop(self):
        if self.head is None:
            return None
        poppedNode = self.head 
        self.head = self.head.next 
        return poppedNode.data



# this is O(n) but can be done in O(1) above
# class Node:
#     def __init__(self, data):
#        self.data = data
#        self.next = None
 
# class Stack:
#     def __init__(self):
#         self.head = None
        
#     def push(self, data):
#         newNode = Node(data)
#         if self.head == None:
#             self.head = newNode 
#         else:
#             cur = self.head
#             while cur.next:
#                 cur = cur.next 

#             cur.next = newNode

#     def pop(self):
#         cur = self.head 

#         while cur.next.next:
#             cur = cur.next 

#         poppedNode = cur.next 
#         cur.next = None 
#         return poppedNode.data 


# 1 -> 2 -> 3
# c    c    

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
