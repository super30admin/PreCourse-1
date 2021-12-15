
class myStack:
# Implement Stack using array
# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes..except the show function. I am getting response that says None. Not sure why
# Any problem you faced while coding this : MY push function only occurs onces and doesn't push again


# Your code here along with comments explaining your approach



     def __init__(self):
      self.items = [1,2,3,4];  #initializing an array
     def isEmpty(self):
      return self.items == []; #is empty
         
     def push(self, item):
       self.items.append(item);
         
     def pop(self):
       self.items.pop(); #built in function that removes last int
        
        
     def peek(self):
       return self.items[len(self.items) - 1];
        
     def size(self):
       return len(self.items)
         
     def show(self):
       return self.items
         

s = myStack()
s.push(12)
s.push(2) #not working
print(s.pop())  #not working
print(s.show()) #not working =(
