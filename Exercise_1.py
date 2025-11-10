#TC = isempty, pusing, popping, peeking, size would be O(1) and the showing/printing the stack would be o(n)
#Sc = o(n) since we have to store all elements even if we pop then, so number of elements pushed
# solved minstack on leetcode, in the append function, we append the minimum value of the two (one we currently are processing VS one that is already on top of min stack)
#if min stack is already empty, add the current one to it
#similarly, when we want to pop an element, we pop it from the minstack as well, since we build both the arrays simultaneously


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = [] #created an array to store
         
     def isEmpty(self):
          return len(self.stack) == 0 #if len is 0, then it is empty
         
     def push(self, item):
          self.stack.append(item) #just append
         

     def pop(self):
          if self.isEmpty():
               return "Empty stack" #check if its already empyt before popping
          return self.stack.pop()
        
        
     def peek(self):
          return self.stack[-1] #return top element
        
     def size(self):
          return len(self.stack) #return len 
         
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

