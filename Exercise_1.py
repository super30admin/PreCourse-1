// Time Complexity : push(), pop(), isEmpty() and peek() all take O(1) time
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Didn't run the code in leet code. As it is not available in leetcode
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class myStack:

     def __init__(self):#defining stack
         self.entry = []     

     def isEmpty(self):#Check whether the stack is empty or not
         return self.entry == []
     
     def push(self, item):#Adding elements to stack
         self.entry.append(item)

     def pop(self):#removing elements from stack
         return self.entry.pop()

     def peek(self):#for finding the top element in the stack
         return self.entry[len(self.entry)-1]

     def size(self):#to find the size of the stack
         return len(self.entry)    

     def show(self):#to display the elements in the stack
         return self.entry

s = myStack()

s.push('1')

s.push('2')

print(s.pop())

print(s.show())
