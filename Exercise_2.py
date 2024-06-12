"""
Time complexity: O(1)
Space complexity: O(1)

Any problem you faced while coding this:

Popping when single element was bit challenging.

Explantion:
Created a top element that is head in the linked list.

When pushing checked the top if it is None, updated the top element
or else made new node as top element 

Used two condition, 

When more than one node is available
Made the top node next as Top element.

When one Node was available 
Made the top as None 

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        temp = Node(data)
        if self.top == None:
            self.top = temp
        else:
            temp.next = self.top
            self.top = temp
        
    def pop(self):      
        if self.top and self.top.next:
            temp = self.top 
            self.top = self.top.next 
            temp.next = None
            return temp.data  
        elif self.top and not self.top.next:
            temp = self.top 
            self.top = None
            return temp.data
        else:
            return None


        
        
a_stack = Stack()

#a_stack.push(1)
#a_stack.push(2)
#a_stack.push(3)
#print(a_stack.pop())
#print(a_stack.pop())
#print(a_stack.pop())
#print(a_stack.pop())


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
        


