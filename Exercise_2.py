# Time Complexity :
# O(1)

# Space Complexity :
# O(N) : N is the size of LL

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach

# Here i have created a link list in such a way that whenever a data is pushed into LL it will become 
# the new head of the LL. This way when we pop a element from LL we do not have to traverse to end of LL
# and can simply move the head to next node (This will lead to achieve O(1) complexity). 

# Suppose the pushed elements are 1, 2, 3, 4

# the resultant LL for this: head -> 4 -> 3 -> 2 -> 1 -> None


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.__head = None
        self.__count = 0
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.__head
        self.__head = newNode
        self.__count += 1
        return
        
        
    def pop(self):
        popped = self.__head.data
        self.__head = self.__head.next
        self.__count -= 1
        return popped
        
        
        
        
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
