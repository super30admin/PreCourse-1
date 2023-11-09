# Time Complexity : Constant time or O(1)
# Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
   
     def __init__(self):
        self.arr = []


     def isEmpty(self):
        
        if (len(self.arr)==0): # SInce the lenth of the array s 0, it has to be empty 
            print("Stack is empty.")
        else:
            print("Stack is not empty.")

     def push(self, item):
        self.arr.append(item) # appending an item to the array will perform the push operation 
        print("On stack after push:", self.arr)
        return self.arr

     def pop(self):
        self.arr =self.arr[1:] # The array is updated such that index 1 ---> new index zero
        print("On stack after pop:")
        return self.arr
        
     def peek(self):
        print("On stack")
        return self.arr[0] 
        
     def size(self):
        print("Stack size")
        return len(self.arr)
        
     def show(self):
        print("On stack")
        return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
