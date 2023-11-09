# Time Complexity :
# O(1)

# Space Complexity :
# O(N): N is size of stack

# Did this code successfully run on Leetcode :
# yes

# // Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# i have maintained a array which acts like a stack and a count variable. On every push an element is appended 
# to this array and count is incremented by 1 and on every pop last element is popped out from the array and
# count variable is decremented by 1. I have maintained count variable as it will help us to do all operations
# in (1) time complexity.


class myStack:
    def __init__(self):
            self.__data = list()
            self.__count = 0
            
    def isEmpty(self):
        return self.size() == 0
        
    def push(self, item):
        self.__data.append(item)
        self.__count += 1
         
    def pop(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        self.__count -= 1
        return self.__data.pop()
        
    def peek(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        return self.__data[-1]
        
    def size(self):
        return self.__count
         
    def show(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        return self.__data
        
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
