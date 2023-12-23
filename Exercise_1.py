# Time Complexity - To append into a list, it takes O(1) ,same with peek, pop, size, show takes O(n) to iterate over the elements of the list.
# Space Complexity - O(n) space required for the creation of stack using list. + O(n) to store the elements of stack to display

# Did this code successfully run on Leetcode : This run sucessfully on my vscode
# Any problem you faced while coding this : No, I did not face any problem while coding this
# Utilited List's function append to push into the list, for the pop function, utilized the pop function of list

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0
         
    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            return None
        return self.stack.pop()
        
    def peek(self):
        if self.isEmpty():
            return None
        return self.stack[-1]
        
    def size(self):
        return len(self.stack)
         
    def show(self):
        length = self.size()
        #Iterates from the last index to the 0th index, by decreasing one index each time
        result = []
        for i in range(length-1, -1, -1):
            result.append(self.stack[i])
        return result


#TestCase -1 
s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print("Popped element is ", s.pop())
print("The top element is ", s.peek())
print("The stack showed is ", s.show())

#TestCase -2 
#Passing empty stack to perform other operations
s = myStack()
print("Popped element is ", s.pop())
print("The top element is ", s.peek())
s.push('1')
s.push('2')
print("The stack showed is ", s.show())