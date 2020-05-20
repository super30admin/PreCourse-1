class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node('#')
    def push(self, data):
        """
        Time Complexity = O(1)
        Space Complexity = O(1)
        """
        if self.head.data == '#':
            self.head.data = data
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp

    def pop(self):
        """
        Time Complexity = O(1)
        Space Complexity = O(1)
        """
        if self.head.next != None:
            ans = self.head
            temp = self.head.next
            self.head.next = None
            self.head = temp
            return ans.data
        
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
