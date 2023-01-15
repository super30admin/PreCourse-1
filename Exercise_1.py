# Time Complexity : O(N), N being the number of executions. 
# Space Complexity : O(N), N being the number of executions. 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Formatting of new python
# files was weird in VScode. 


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.array = []

    def isEmpty(self):
        if len(self.array)==0:
            return True
        else:
            return False

    def push(self, item):
        self.array.append(item)

    #Removes the item at the end of array and returns item, if 
    # there is an item available.
    def pop(self):
        if len(self.array)==0:
            return ""
        else:
            return self.array.pop(-1)

    #Returns the last item, if length of array is greater than 0.   
    def peek(self):
        if len(self.array)==0:
            return ""
        else:
            return self.array[-1]

    def size(self):
        return len(self.array)

    def show(self):
        print(self.array)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
