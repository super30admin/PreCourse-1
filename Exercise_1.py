# Time Complexity : O(1)
# Space Complexity : O(n) where n is the capacity of the stack
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No issues


# I used a fixed-size list and a top pointer to manage the stack.

class myStack:

     def __init__(self, capacity):
          self.capacity = capacity #for storing how many items we can hold
          self.top = -1 # -1 means the stack is empty
          self.array = [None] * capacity #created a list
         
     def isEmpty(self):
          return self.top == -1 #if top is -1 there are no items
         
     def push(self, item):
          if self.top >= self.capacity - 1: #if we reached capacity, we can't add more
               print("Stack Overflow")
          self.top += 1 #moving top up and storing the new item there
          self.array[self.top] = item
         
     def pop(self):
        if self.isEmpty(): #can't remove from empty stack
             print("Stack Underflow")
        item = self.array[self.top] #grabbing the top item and clearing its spot
        self.array[self.top] = None
        self.top -= 1 #moving top down
        return item
        
     def peek(self):
          if self.isEmpty(): 
               print("Stack is Empty")
          return self.array[self.top] # looking at the top without taking it out
        
     def size(self):
          return self.top + 1  # number of items is top + 1
         
     def show(self):
          return self.array[: self.top + 1] # returning a slice of items from bottom to top


if __name__ == "__main__":
     s = myStack(5)  # make a stack that holds up to 5 items
     s.push('1')
     s.push('2')
     print(s.pop()) # prints '2'
     print(s.show())  # prints ['1']

