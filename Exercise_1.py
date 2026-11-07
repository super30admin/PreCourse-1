
# Time Complexity :
#       push: O(1) best and average case. I think python internally uses dynamic array for a list data structure. So every time we try to append, it calculates memeory slot for the next element and it does not travel across each emmeory block to find the next ememory location that needs to be used, hence its O(1). when the memory is filled up, then it allocates new larger block of memeory and does copy all the elements in the new block and then appends the element. so copy might cause O(N). but this happens only when memory is filled up. so worst case O(N). best and average case is O(1)
#       pop: O(1) Since it is kind of getting and removing the element by calculating the memory location of the latest element using starting address and length of the array. so it clears the memory and sets it to None and then decreases the size/length counter. so next time we do pop it calculates the location of latest element by using starting address and length of the array - counter.
#       peek: O(1) - we are using -1 index which internally tranforms into length - 1. so basically it needs to know the address by using a formula which is starting address + (index * size of size of one slot). so since its caluclating using formula its O(1), no traversing through each and every element.
#       isEmpty and Size: both are O(1) - size counter as explained above is used to track the length internally.
#       show : O(N) - since we are using self.stack[::-1] sowhat this does internally is it creates a new list and then copies each and every item into the list in reverse order. since its stack its Last In First Out(LIFO) so we will have to print last element first to show elements in stack. so if there are N elements it takes O(N) time complexity.



# Space Complexity : O(N) - Number of elements stored in the stack.


# Did this code successfully run on Leetcode : Yes


# Any problem you faced while coding this : did not use isEmpty method initially so had #redundant code and hthen later refactored it. In python almost all of this has methods #defined so tried to not use them for popping atleast.

# Your code here along with comments explaining your approach

#Trying to push again.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          #defining a instance variable which is a list. supposed to store all elements.
          self.stack = []


    #checks if stack is empty. used self.stack since it resolves to finding length - pre calculated len counter.
     def isEmpty(self):
          if self.stack:
               return False
          return True

    #pushes elements into the stack using default append method. its a dynamic array so worst case it will need to copy all the elements into new list rarely.
     def push(self, item):
          self.stack.append(item)

    #removes and gives the top element in the stack. used del to remove the last element.
     def pop(self):
          if not self.isEmpty():
               top = self.stack[-1]
               del self.stack[-1]
               return top
          return None

    #this is like top method to return the latest element in the stack. it does not removes it just returns the top element.
     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        return None

    #size of the stack is returned. gives number of elements in stack.
     def size(self):
          return len(self.stack)

    #returns elements in the stack if any, or returns None elements in stack in formatted string.
     def show(self):
          if not self.isEmpty():
              return f"elements in stack : {self.stack[::-1]}"
          return f"No elements in stack"
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

s.push('3')
s.push('4')
print(s.peek())
print(s.size())
print(s.show())
