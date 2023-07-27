
# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

# our code here along with comments explaining your approach


class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file

    """
    This class specifies the functionalities of the properties of stack, Implementation of stack using array
    """
    def __init__(self):
        #array is initialized
        self.array = []

    def isEmpty(self):

        """
        checks whether the stack is empty/ the array referring the stack is empty
         Time Complexity : 0(1)
        Space Complexity : 0(1)

        """
        if len(self.array)==0:
            return True

    def push(self, item):

        """
        Pushing the elements in the stack
         Time Complexity : 0(1)
        Space Complexity : 0(1)

        """
        self.array.append(item)

    def pop(self):
        """
        Stack refers last in first out, so to pop, the latest or the last element pushed should be fetched
         Time Complexity : 0(n)
        Space Complexity : 0(n)

        """
        reverse_array = self.array[::-1]
        y = reverse_array.pop(0)
        self.array = reverse_array
        return y

    def peek(self):
        """
        Since it is stack, latest element pushed is the peek
         Time Complexity : 0(1)
        Space Complexity : 0(1)

        """
        return self.array[len(self.array)-1]

    def size(self):
        """
        size of the stack, after all the stack operations
         Time Complexity : 0(1)
        Space Complexity : 0(1)

        """
        return len(self.array)

    def show(self):
        """
        element remaining in stack are shown
         Time Complexity : 0(1)
        Space Complexity : 0(1)

        """
        return self.array


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
