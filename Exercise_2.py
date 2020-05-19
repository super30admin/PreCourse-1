# Time Complexity : O(1) constant time for every operation
# Space Complexity : O(n) space, where n is the size of the stack
# Did this code successfully run on Leetcode : N.A.
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        # top pointer maintained for push, pop and peek
        self.top = None
        # size variable maintained for size method
        self.siz = 0

    def push(self, data):
        # adding to the head of the list
        self.siz += 1
        toAdd = Node(data)
        toAdd.next = self.top
        self.top = toAdd

    def pop(self):
        # removing and returning from the head of the list
        if not self.top == None:
            self.siz -= 1
            toReturn = self.top
            self.top = self.top.next
            return toReturn.data

    def peek(self):
        # returning element at the head of the list, without removal
        if not self.top == None:
            return self.top.data

    def isEmpty(self):
        # checking if size == 0
        return self.size() == 0

    def size(self):
        # returning variable maintained for size
        return self.siz


s = Stack()
for i in range(0, 10):
    s.push(i)
    # print(s.size())

print(s.isEmpty())
# print(s.pop())
# print(s.peek())
# print (s.pop())

for i in range(0, s.size()):
    # print(s.pop())
    assert (s.peek() == s.pop())

print(s.isEmpty())

# a_stack = Stack()
# while True:
#     print('push <value>')
#     print('pop')
#     print('quit')
#     do = input('What would you like to do? ').split()
#
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
