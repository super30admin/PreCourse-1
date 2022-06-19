

# Time Complexity : O(1)
# Space Complexity : O(1) - for this problem it is O(1) since we are inserting only two items and popping one item. But if the list is n numbers, then it would be O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : I am not confident about how to determine space and Time complexity for a particular algo and also I am not sure if my above analysis 
# for space complexity is correct. I have implemeted the problem using arrays.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.size = 0

    def isEmpty(self):
        return self.size == 0
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.head.next
        self.head.next = newNode
        self.size += 1
    
    def pop(self):
        if self.isEmpty():
            raise Exception("Empty Stack!!")
        remove  = self.head.next
        self.head.next = self.head.next.next
        self.size-=1
        return remove.data
        
        
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
