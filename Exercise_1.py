# Time Complexity : push O(1), pop O(1), peek O(1)
# Space Complexity : push O(n), pop O(n), peek O(n)

class myStack:
    #Please read sample.java file before starting.
    #Kindly include Time and Space complexity at top of each file
        def __init__(self):
            self.arr = []
      
        def isEmpty(self):
            if len(self.arr) == 0:
                return True
            return False
          
        def push(self, item):
            self.arr.append(item) # Adding the new element to the top of the list
          
        def pop(self):
            return self.arr.pop() # Use pop to delete the last element added to the list
        
        def peek(self):
            return self.arr[len(arr)-1] # Returning the top element from the list
        
        def size(self):
            return len(self.arr)

        def show(self):
            return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
