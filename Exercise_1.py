#Time Complexity :
# Push, pop, peek  Peek, Size - O(1)
# Show - O(N), N = size of list 

#Space Complexity :
# O(N), N is the number of elements in the array

#Did this code successfully run on Leetcode :
#Yes

#Any problem you faced while coding this :
#No. The only slight hiccup I had was I did not find the exact same problem on leetcode - only a modified one with a maxSize and implemented that


#Your code here along with comments explaining your approach

class myStack:
    #Please read sample.java file before starting.
    #Kindly include Time and Space complexity at top of each file   

    def __init__(self,maxSize):
        #creating an empty array and storing the maximum size
        self.a = []
        self.maxSize = maxSize
         
    def isEmpty(self):
        if len(self.a) == 0 :
            return True
        else :
            return False
         
    def push(self, item):
        #Check if the array size is smaller than maximum allowed size, if it is, then append element to list
        if len(self.a) < self.maxSize :
            self.a.append(item)
         
    def pop(self):
        #Checking if the current array some elements - then remove the last element and return it
        if len(self.a) != 0 :
            value = self.a[-1]
            self.a = self.a[:-1]
            return value
        else :
            return -1
        
    def peek(self):
        if len(self.a) != 0:
            return self.a[-1]
        else :
            return -1
        
    def size(self):
        return len(self.a)
         
    def show(self):
        #Print all array elements
        for i in range(len(self.a)):
            print (self.a[i])
        

s = myStack(5)
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
