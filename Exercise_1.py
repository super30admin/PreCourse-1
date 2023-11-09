

# // Time Complexity : O(1) expect show method which traverses throughout the array an takes O(n) 
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

# Create an array
  def __init__(self):
    self.arr = []


# If array is empty then return
  def isEmpty(self):
    if len(self.arr) == 0:
      return


# Push elements to stack
  def push(self, item):
    self.arr.append(item)


# Pop elements from stack until there is no elements
  def pop(self):
    if len(self.arr) == 0:
      print("No elements to pop")
    else:
      print(self.arr[-1])


# Prints the top element of the stack
  def peek(self):
    print(self.arr[-1])
        

# Prints the size of stack
  def size(self):
    print(len(self.arr))


# Prints values of stack
  def show(self):
    for values in self.arr:
      print(values)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
