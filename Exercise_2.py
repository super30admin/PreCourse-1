"""
Runtime Complexity:
1) Initialization, push(), pop() operation takes O(1) time, because we dont traverse the list. We use pointers instead, and update the pointers respective to the operations
2) Yes, the code worked on leetcode.
3) I was having difficulty with EOF, took pretty long time to debug that. I figured because of while loop, the recursion goes on until the depth is exceeded. 
So I used try and except blocks.

Space Complexity:
O(n) - 'n' number of nodes stored.

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        node = Node(data)
        node.next = self.root
        self.root = node
      
        print("\n",str(node.data)+ " has been pushed to the stack")
        
        
    def pop(self):
        if self.root == None:
            print("Stack is empty")
        else:
            temp = self.root
            self.root = self.root.next
            return temp.data
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push")
    print("pop")
    print("quit")
    try:
        do = input("What would you like to do:").split(" ")
    except EOFError as e:
        break
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
    





