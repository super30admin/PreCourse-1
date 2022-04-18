'''
Approach

1. Initialize an empty list in constructor
2. Push(): Add element to the last of the list. For this used append Time Complexity: 0(1) because we are performing single operation at the end of the list
3. isEmpty(): If length of list is zero, return True Time Complexity: 0(1) because we are checking the length and returning boolean
4. Pop(): Remove the last element from the list. Used slice approach which is common in python Time Complexity: Depends on slice. I think it's 0(1) as we are just removing the last element from the list
5. Peek()/Show(): I think its similar functions where we need to return the current stack Time Complexity is 0(1)
6. Size(): Return the number of elements in the stack Time Complexity is 0(1)

Didnt check on leet-code, don't have/know the problem
'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stackList = []
        
     def isEmpty(self):
         
         # If length of list == 0
         if len(self.stackList) == 0:
             return True
         else:
             return False
    
     def push(self, item):
        # Append the element to the list
        self.stackList.append(item)
        return self.peek()
    
     def pop(self):
        # Remove the last element from the list
        # Slice the list
        self.stackList = self.stackList[0:len(self.stackList)-1]
        return self.peek
    
     def peek(self):
        # Return the stack
        return self.stackList
    
     def size(self):
        return len(self.stackList)
    
     def show(self):
        # Return the stack
        return self.stackList

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())