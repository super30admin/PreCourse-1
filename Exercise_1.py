class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     """
        Initializes the stack
        Time Complexity: O(1)
        """
     def __init__(self):
        self.res = []

     def isEmpty(self):
        return (len(self.res) > 0)


    """
    Appends the element to the end of the list
    Time Complexity: O(1)
    """
     def push(self, item):
        self.res.append(item)

     """
     Removes the last added element
     Time Complexity O(1)
     """
     def pop(self):
        if self.res:
            return self.res.pop()

     """
     Prints the last added element
     Time Complexity O(1)
     """
     def peek(self):
        if self.res:
            return self.res[-1]
        return self.res
        
     def size(self):
        return len(self.res)

     def show(self):
        return self.res


s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
print(s.pop()) # show 6
print(s.pop()) # show 5
print(s.peek())
print(s.pop()) # show 4
print(s.show()) # print the whole list
print(s.peek())
