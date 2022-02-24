
'''
// Time Complexity : push =O(1) , pop =O(1) peek=O(1) , isEmpty=O(1)
// Space Complexity : push =O(1) , pop=O(1) , peek=O(1) , isEmpty=O(1)

// Did this code successfully run on Leetcode :
    Not able to find equivalent problem in Leetcode
// Any problem you faced while coding this :
    - Implemented pop to  O(N) but revised it to O(1)
    
// Your code here along with comments explaining your approach
    - See comments in line
'''


# LinkedList Node class to hold every Nodes, each node would have data and pointer to next node
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 

'''
Typical stack           (head)6|5|4|(bottom)
Stack on LinkedList     (head)6->5->4(bottom)
    push :  Add a new node as new head, current head goes next
    pop  :  point head to current head's next
'''    
# Stack class implemented with LinkedList
class Stack:
    # Instance variables head and tail added
    def __init__(self):
        self.head=None

    def push(self, data):
        if self.head is None:
            self.head=Node(data)
        else:
            tmp=self.head
            self.head=Node(data)
            self.head.next=tmp

    def pop(self):
        if self.head is None:
            print('stack underflow')
            return None
        else:
            tmp = self.head.data
            self.head=self.head.next
            return tmp
    
    def peek(self):
        if self.head is None:
            return None
        else:
            return self.head.data

    def isEmpty(self):
        return self.head is not None
        
stack = Stack()

stack.push(4)
print('peeked '+str(stack.peek()))
stack.push(5)
print('peeked '+str(stack.peek()))
stack.push(6)
print('peeked '+str(stack.peek()))

print(stack.pop())
print('peeked '+str(stack.peek()))
print(stack.pop())
print('peeked '+str(stack.peek()))
print(stack.pop())
print('peeked '+str(stack.peek()))
print(stack.pop())


# while True:
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     print('push <value>')
#     print('pop')
#     print('quit')
#     do = input('What would you like to do? ').split()
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     operation = do[0].strip().lower()
#     if operation == 'push':
#         a_stack.push(int(do[1]))
#     elif operation == 'pop':
#         popped = a_stack.pop()
#         if popped is None:
#             print('Stack is empty.')
#         else:
#             print('Popped value: ', int(popped))
#     elif operation == 'quit':
#         break
