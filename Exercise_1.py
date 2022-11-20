### Time complexity: ###
# isEmpty(): O(1)
# push(): O(1)
# pop(): O(1)
# peek(): O(1)
# size(): O(1)
# show(): O(n)

### Space Complexity: ##
# Since we use an array data structure to store every element or perform any operation
# the time complexity will be O(n)

# Did not try to run this code on leetcode as the questions are a litte different on leetcode

# No issues faced while coding this exercise

## Code along with comments explaining my approach
class myStack:
  def __init__(self):
    self.stack = []   #creating an array

  def isEmpty(self):
    if len(self.stack) == 0:    #checking if length is zero
      return True
    else:
      return False

  def push(self, item):
    self.stack.append(item)     #push the item on to stack using append()
    print(f"Item {item} pushed to stack.")

  def pop(self):
    return self.stack.pop()     #pop element from stack using pop()

  def peek(self):
    return self.stack[-1]       #check element on top of stack 

  def size(self):
    return len(self.stack)      #return length of the stack

  def show(self):
    return self.stack           #show the entire stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())
s.push('3')
print(s.peek())
print(s.size())
print(s.show())