# Exercise_1 : Implement Stack using Array.

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes 
# Any problem you faced while coding this : looking on how to remove the last element of the array without using pop funciton 
# Your code here along with comments explaining your approach -  

class myStack:
    
    # initialised the array 
    def __init__(self):
        self.arr = []

    # returned boolean if the stack is empty or not
    def isEmpty(self):
        return len(self.arr) == 0
    
    # adding an element at the end of the stack 
    def push(self, item):
        self.arr.append(item)

    # removing and returning the last element of the array 
    def pop(self):
        if self.isEmpty():
            return None 
        
        s = self.size()
        b = self.arr[s - 1]
        self.arr = self.arr[:s-1]
        return b

    # returns the last element of array 
    def peek(self):
        return self.arr[-1]  

    # return the size of the stack 
    def size(self):
        return len(self.arr)

    # prints the stack 
    def show(self):
        return self.arr


s = myStack()
print(s.isEmpty())   
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
