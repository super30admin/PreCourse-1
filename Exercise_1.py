// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class myStack:

     def __init__(self):
         self.entry = []     

     def isEmpty(self):
         return self.entry == []
     
     def push(self, item):
         self.entry.append(item)

     def pop(self):
         return self.entry.pop()

     def peek(self):
         return self.entry[len(self.entry)-1]

     def size(self):
         return len(self.entry)    

     def show(self):
         return self.entry

s = myStack()

s.push('1')

s.push('2')

print(s.pop())

print(s.show())
