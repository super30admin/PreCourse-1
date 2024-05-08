
"""
 Time Complexity : 
 Push - O(1)
 Pop - O(1)
 Peek - O(1)
 Show - O(n) where n is no of elements in stack 

 Space Complexity : O(1) except for show where we're using an external list to store elements
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No


 Your code here along with comments explaining your approach : (Note: Added peek & show method for practice)
 1. __init__ method : Initialized head to None.
 2. push method : Creating new node and adding it to current head's next and making the new_node as new head.
 3. pop method : Checking if the head is empty, if yes we're returning None else we're storing the current head in new variable and then pointing current head to it's next and then returning the data in new variable.
 4. peek method : Checking if the head is empty, if yes we're returning None else we're returning the head data.
 5. show method : Traversing the whole head and storing each element in list and returning it.
 
 """
 
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        if not self.head:
            print("Stack Underflow")
            return None
        else:
            popped_node = self.head
            self.head = self.head.next
            return popped_node.data
            

    def peek(self):
        return self.head.data if self.head else None
    
    def show(self):
        stack = []
        curr = self.head
        while curr is not None:
            stack.append(curr.data)
            curr = curr.next
        return stack[::-1]

        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
    print('show')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'peek':
        peek = a_stack.peek()
        if peek is None:
            print('Stack is empty.')
        else:
            print('peek value: ', int(peek))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'show':
        res = a_stack.show()
        print(res)
    elif operation == 'quit':
        break
