# Time Complexity : O(1)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : How do we run the code on leetcode?
# Any problem you faced while coding this : Yes, The show function was not clear in formating, 
#                                           should it be simple print each element or return the list 

# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        #constructor array
        self.items = []
     def isEmpty(self):
        # if length is 0
        return len(self.items)==0
     def push(self, item):
        # adds item to the end
        self.items.append(item) 
     def pop(self):
        #removes item from end
        return self.items.pop()        
     def peek(self):
        #last elemet returned
        return self.items[len(self.items)-1]
     def size(self):
        #length of array
        return len(self.items)
     def show(self):
        #print each element       
        return self.items

s = myStack()
s.push('1')
s.push('2')

print(s.pop())
print(s.show())
