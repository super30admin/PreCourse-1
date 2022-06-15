"""
Runtime Complexity: 
1) Initializing stack array takes O(1), because we declare an empty array.
2) isEmpty() operation takes O(1), checks for the length of the stack using python in-built function.
3) push()  operation takes O(1), because we just append the new item to the end of the list and we dont traverse the entire list.
4) pop() operation takes O(1), because we check the length of the stack, if it is not empty we remove the topmost element in the stack.
5) peek() operation takes O(1) as well, because we just display the last element in the list.
6) size() operation takes O(1), because we just return the length of the stack.
7) show() operation takes O(n) runtime, as we need to traverse the entire items in the ist.

Space Complexity:
O(n)- depends on the number of items stored in the stack.


"""


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    
     
    stack =[]
    def __init__(self):
        self.stack= []
        
         
    def isEmpty(self):
        if (len(self.stack)==0):
            print("Stack is empty")
        else:
            print("Stack is not empty")
         
    def push(self, item):
        self.stack.append(item)
        print("Item:"+item+" has been added to the stack")
         
    def pop(self):
        if len(self.stack)==0:
            print("Stack Empty")
        else:
            self.stack.pop()
        
        
    def peek(self):
        if len(self.stack)==0:
            print("Stack is Empty")
        else:
            print("The Topmost element added to stack is:"+ self.stack[len(self.stack)-1])
        
    def size(self):
        print("The size of the stack is:"+ str(len(self.stack)))
         
    def show(self):
        print("Items in Stack:")
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
#s.push('2')
#s.push('3')
s.isEmpty()
#print(s.pop())
print(s.show())
s.size()
s.peek()
