"""

Intuition:  Stack utilizes a first in, last out property. 
To keep track of the topmost element a top variable has been used. 
This variable represents the index at which the topmost item is present.

#####################################################################
isEmpty Method: The inbuilt len() method is utilized
Since __len__ is an attribute, the time complexity of that method is O(1)
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Push Method: Placing the element in the top index.
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Pop Method: This method simply involves decrementing the top index
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Peek Method: Accessing the element present at the top index.
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Size Method: Getting the index of top element + 1
Time Complexity : O(1)
Space Complexity : O(1)
#####################################################################
Show Method: Printing all the elements from index 0 to index top.
Time Complexity : O(N)
Space Complexity : O(1)
#####################################################################
"""

class myStack:
    def __init__(self):
        self.maxSize = 10
        self.stack = [float("inf")]  * self.maxSize
        self.top = -1


    def isEmpty(self):
        return True if len(self.top) == -1 else False


    def push(self, item):
        #If the stack length exceed the max length
        if self.top + 1 == self.maxSize:
            print("StackOverflow!")
            return False

        #If the stack length is less than the max length
        self.top += 1
        self.stack[self.top] = item
        print("Pushed",item, "into the stack")


    def pop(self):
        #If the stack is empty
        if self.top < 0:
            print("Stack underflow! - Stack is empty")
            return 0
        
        #If the stack has 1 ore more elements
        deletedItem =  self.stack[self.top]
        self.top -= 1
        return deletedItem


    def peek(self):

        #If the stack is empty
        if self.size() <= 0:
            print("Stack is empty!")
            return 0

        #If the stack has 1 or more elements
        return self.stack[self.top]


    def size(self):
        return self.top + 1
         
        
    def show(self):
        print("Item(s) currently present in the stack:")
        for index in range(self.top+1):
            print(self.stack[index],  end = ' ')
         

s = myStack()
s.pop()
s.peek()
s.push('1')
s.push('2')
print(s.peek(), "is currently at the top")
print(s.pop(), "is the deleted item")
s.show()
