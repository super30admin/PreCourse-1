#Time Complexity : O(1)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : No, I did not run it on leetcode
#Any problem you faced while coding this : I am not sure on the complexity particularly space complexity


#Your code here along with comments explaining your approach


class myStack:
    #here i am initializing a stack from the list in python
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        #checking weather the stack contains any items in it
        return len(self.items) == 0
     
    def push(self, item):
        #appends every new item to the top of the stack (i.e: list)
        self.items.append(item)
         
    def pop(self):
        # we use the pop() function on list to remove the last element and we return it
        return self.items.pop()
    
    def peek(self):
        # peek function is used to get the top element of the stack, without removing it.
        return self.items[-1]
    
    def size(self):
        #returns length of stack
        return len(self.items)
    
    def show(self):
        #print the items in the stack
        return self.items

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.peek())
print(s.show())
